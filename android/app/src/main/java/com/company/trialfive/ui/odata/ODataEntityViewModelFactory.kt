package com.company.trialfive.ui.odata

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.company.trialfive.ui.odata.viewmodel.ODataViewModel
import com.company.trialfive.ui.odata.viewmodel.alphabeticallistofproduct.AlphabeticalListOfProductODataViewModel
import com.company.trialfive.ui.odata.viewmodel.category.CategoryODataViewModel
import com.company.trialfive.ui.odata.viewmodel.categorysalesfor1997.CategorySalesFor1997ODataViewModel
import com.company.trialfive.ui.odata.viewmodel.currentproductlist.CurrentProductListODataViewModel
import com.company.trialfive.ui.odata.viewmodel.customerandsuppliersbycity.CustomerAndSuppliersByCityODataViewModel
import com.company.trialfive.ui.odata.viewmodel.customerdemographic.CustomerDemographicODataViewModel
import com.company.trialfive.ui.odata.viewmodel.customer.CustomerODataViewModel
import com.company.trialfive.ui.odata.viewmodel.employee.EmployeeODataViewModel
import com.company.trialfive.ui.odata.viewmodel.invoice.InvoiceODataViewModel
import com.company.trialfive.ui.odata.viewmodel.orderdetail.OrderDetailODataViewModel
import com.company.trialfive.ui.odata.viewmodel.orderdetailsextended.OrderDetailsExtendedODataViewModel
import com.company.trialfive.ui.odata.viewmodel.ordersubtotal.OrderSubtotalODataViewModel
import com.company.trialfive.ui.odata.viewmodel.order.OrderODataViewModel
import com.company.trialfive.ui.odata.viewmodel.ordersqry.OrdersQryODataViewModel
import com.company.trialfive.ui.odata.viewmodel.productsalesfor1997.ProductSalesFor1997ODataViewModel
import com.company.trialfive.ui.odata.viewmodel.product.ProductODataViewModel
import com.company.trialfive.ui.odata.viewmodel.productsaboveaverageprice.ProductsAboveAveragePriceODataViewModel
import com.company.trialfive.ui.odata.viewmodel.productsbycategory.ProductsByCategoryODataViewModel
import com.company.trialfive.ui.odata.viewmodel.region.RegionODataViewModel
import com.company.trialfive.ui.odata.viewmodel.salesbycategory.SalesByCategoryODataViewModel
import com.company.trialfive.ui.odata.viewmodel.salestotalsbyamount.SalesTotalsByAmountODataViewModel
import com.company.trialfive.ui.odata.viewmodel.shipper.ShipperODataViewModel
import com.company.trialfive.ui.odata.viewmodel.summaryofsalesbyquarter.SummaryOfSalesByQuarterODataViewModel
import com.company.trialfive.ui.odata.viewmodel.summaryofsalesbyyear.SummaryOfSalesByYearODataViewModel
import com.company.trialfive.ui.odata.viewmodel.supplier.SupplierODataViewModel
import com.company.trialfive.ui.odata.viewmodel.territory.TerritoryODataViewModel
import com.sap.cloud.mobile.kotlin.odata.EntitySet
import com.sap.cloud.mobile.kotlin.odata.EntityType
import com.sap.cloud.mobile.kotlin.odata.EntityValue
import com.sap.cloud.mobile.kotlin.odata.Property
import com.sap.cloud.android.odata.northwindentities.NorthwindEntitiesMetadata.EntitySets
import com.sap.cloud.android.odata.northwindentities.NorthwindEntitiesMetadata.EntityTypes

class ODataEntityViewModelFactory(
    private val application: Application,
    private val entityType: EntityType,
    private val entitySet: EntitySet?,
    private val orderByProperty: Property?,
    private val parent: EntityValue? = null,
    private val navigationPropertyName: String? = null,
) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        @Suppress("UNCHECKED_CAST")
        return when (getKey(entityType, entitySet)) {
            getKey(EntityTypes.alphabeticalListOfProduct, EntitySets.alphabeticalListOfProducts) -> AlphabeticalListOfProductODataViewModel(
                application,
                orderByProperty,
                parent,
                navigationPropertyName
            ) as T
            getKey(EntityTypes.category, EntitySets.categories) -> CategoryODataViewModel(
                application,
                orderByProperty,
                parent,
                navigationPropertyName
            ) as T
            getKey(EntityTypes.categorySalesFor1997, EntitySets.categorySalesFor1997) -> CategorySalesFor1997ODataViewModel(
                application,
                orderByProperty,
                parent,
                navigationPropertyName
            ) as T
            getKey(EntityTypes.currentProductList, EntitySets.currentProductLists) -> CurrentProductListODataViewModel(
                application,
                orderByProperty,
                parent,
                navigationPropertyName
            ) as T
            getKey(EntityTypes.customerAndSuppliersByCity, EntitySets.customerAndSuppliersByCities) -> CustomerAndSuppliersByCityODataViewModel(
                application,
                orderByProperty,
                parent,
                navigationPropertyName
            ) as T
            getKey(EntityTypes.customerDemographic, EntitySets.customerDemographics) -> CustomerDemographicODataViewModel(
                application,
                orderByProperty,
                parent,
                navigationPropertyName
            ) as T
            getKey(EntityTypes.customer, EntitySets.customers) -> CustomerODataViewModel(
                application,
                orderByProperty,
                parent,
                navigationPropertyName
            ) as T
            getKey(EntityTypes.employee, EntitySets.employees) -> EmployeeODataViewModel(
                application,
                orderByProperty,
                parent,
                navigationPropertyName
            ) as T
            getKey(EntityTypes.invoice, EntitySets.invoices) -> InvoiceODataViewModel(
                application,
                orderByProperty,
                parent,
                navigationPropertyName
            ) as T
            getKey(EntityTypes.orderDetail, EntitySets.orderDetails) -> OrderDetailODataViewModel(
                application,
                orderByProperty,
                parent,
                navigationPropertyName
            ) as T
            getKey(EntityTypes.orderDetailsExtended, EntitySets.orderDetailsExtendeds) -> OrderDetailsExtendedODataViewModel(
                application,
                orderByProperty,
                parent,
                navigationPropertyName
            ) as T
            getKey(EntityTypes.orderSubtotal, EntitySets.orderSubtotals) -> OrderSubtotalODataViewModel(
                application,
                orderByProperty,
                parent,
                navigationPropertyName
            ) as T
            getKey(EntityTypes.order, EntitySets.orders) -> OrderODataViewModel(
                application,
                orderByProperty,
                parent,
                navigationPropertyName
            ) as T
            getKey(EntityTypes.ordersQry, EntitySets.ordersQries) -> OrdersQryODataViewModel(
                application,
                orderByProperty,
                parent,
                navigationPropertyName
            ) as T
            getKey(EntityTypes.productSalesFor1997, EntitySets.productSalesFor1997) -> ProductSalesFor1997ODataViewModel(
                application,
                orderByProperty,
                parent,
                navigationPropertyName
            ) as T
            getKey(EntityTypes.product, EntitySets.products) -> ProductODataViewModel(
                application,
                orderByProperty,
                parent,
                navigationPropertyName
            ) as T
            getKey(EntityTypes.productsAboveAveragePrice, EntitySets.productsAboveAveragePrices) -> ProductsAboveAveragePriceODataViewModel(
                application,
                orderByProperty,
                parent,
                navigationPropertyName
            ) as T
            getKey(EntityTypes.productsByCategory, EntitySets.productsByCategories) -> ProductsByCategoryODataViewModel(
                application,
                orderByProperty,
                parent,
                navigationPropertyName
            ) as T
            getKey(EntityTypes.region, EntitySets.regions) -> RegionODataViewModel(
                application,
                orderByProperty,
                parent,
                navigationPropertyName
            ) as T
            getKey(EntityTypes.salesByCategory, EntitySets.salesByCategories) -> SalesByCategoryODataViewModel(
                application,
                orderByProperty,
                parent,
                navigationPropertyName
            ) as T
            getKey(EntityTypes.salesTotalsByAmount, EntitySets.salesTotalsByAmounts) -> SalesTotalsByAmountODataViewModel(
                application,
                orderByProperty,
                parent,
                navigationPropertyName
            ) as T
            getKey(EntityTypes.shipper, EntitySets.shippers) -> ShipperODataViewModel(
                application,
                orderByProperty,
                parent,
                navigationPropertyName
            ) as T
            getKey(EntityTypes.summaryOfSalesByQuarter, EntitySets.summaryOfSalesByQuarters) -> SummaryOfSalesByQuarterODataViewModel(
                application,
                orderByProperty,
                parent,
                navigationPropertyName
            ) as T
            getKey(EntityTypes.summaryOfSalesByYear, EntitySets.summaryOfSalesByYears) -> SummaryOfSalesByYearODataViewModel(
                application,
                orderByProperty,
                parent,
                navigationPropertyName
            ) as T
            getKey(EntityTypes.supplier, EntitySets.suppliers) -> SupplierODataViewModel(
                application,
                orderByProperty,
                parent,
                navigationPropertyName
            ) as T
            getKey(EntityTypes.territory, EntitySets.territories) -> TerritoryODataViewModel(
                application,
                orderByProperty,
                parent,
                navigationPropertyName
            ) as T
            else -> { throw UnsupportedOperationException() }
        }
    }
}
