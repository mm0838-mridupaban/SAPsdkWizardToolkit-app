package com.company.trialfive.service

import com.sap.cloud.mobile.foundation.model.AppConfig
import com.sap.cloud.android.odata.northwindentities.NorthwindEntities
import com.sap.cloud.mobile.foundation.common.ClientProvider
import com.sap.cloud.mobile.kotlin.odata.OnlineODataProvider
import com.sap.cloud.mobile.kotlin.odata.http.OKHttpHandler

object SAPServiceManager {
	
    private const val CONNECTION_ID_NORTHWINDENTITIES: String = "com.sap.android.wizard.sample"
	
	private lateinit var appConfig: AppConfig
	fun initSAPServiceManager(config: AppConfig) {
	        appConfig = config
	}

    var serviceRoot: String = ""
        private set
        get() {
            return (northwindEntities?.provider as OnlineODataProvider).serviceRoot
        }

    var northwindEntities: NorthwindEntities? = null
        private set
        get() {
            return field ?: throw IllegalStateException("SAPServiceManager was not initialized")
        }

    fun openODataStore(callback: () -> Unit = {}) {
		appConfig.serviceUrl.let { _serviceURL ->
		    northwindEntities = NorthwindEntities (
		        OnlineODataProvider("SAPService", _serviceURL + CONNECTION_ID_NORTHWINDENTITIES).apply {
		            networkOptions.httpHandler = OKHttpHandler(ClientProvider.get())
		            serviceOptions.checkVersion = false
		            serviceOptions.requiresType = true
		            serviceOptions.cacheMetadata = false
		        }
		    )
		}
        callback.invoke()
    }

}
