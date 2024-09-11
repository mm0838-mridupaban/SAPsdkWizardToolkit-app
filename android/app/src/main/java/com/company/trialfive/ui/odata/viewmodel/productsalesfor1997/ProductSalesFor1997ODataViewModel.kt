package com.company.trialfive.ui.odata.viewmodel.productsalesfor1997

import android.app.Application
import com.company.trialfive.ui.odata.viewmodel.ODataViewModel
import com.sap.cloud.android.odata.northwindentities.NorthwindEntitiesMetadata
import com.sap.cloud.mobile.kotlin.odata.EntityValue
import com.sap.cloud.mobile.kotlin.odata.Property

class ProductSalesFor1997ODataViewModel(
    application: Application,
    private val orderByProperty: Property?,
    override val parent: EntityValue? = null,
    private val navigationPropertyName: String? = null,
) : ODataViewModel(
    application,
    NorthwindEntitiesMetadata.EntityTypes.productSalesFor1997,
    NorthwindEntitiesMetadata.EntitySets.productSalesFor1997,
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
