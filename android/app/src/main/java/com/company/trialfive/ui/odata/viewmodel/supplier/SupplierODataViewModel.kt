package com.company.trialfive.ui.odata.viewmodel.supplier

import android.app.Application
import com.company.trialfive.ui.odata.viewmodel.ODataViewModel
import com.sap.cloud.android.odata.northwindentities.NorthwindEntitiesMetadata
import com.sap.cloud.mobile.kotlin.odata.EntityValue
import com.sap.cloud.mobile.kotlin.odata.Property

class SupplierODataViewModel(
    application: Application,
    private val orderByProperty: Property?,
    override val parent: EntityValue? = null,
    private val navigationPropertyName: String? = null,
) : ODataViewModel(
    application,
    NorthwindEntitiesMetadata.EntityTypes.supplier,
    NorthwindEntitiesMetadata.EntitySets.suppliers,
    orderByProperty,
    parent,
    navigationPropertyName
) {

//    override fun getAvatarText(entity: EntityValue?): String {
//        val customer = entity as Customer?
//        return customer?.let { "${it.lastName?.first() ?: '?'}${it.firstName?.first() ?: '?'}" }
//            ?: "??"
//    }
}
