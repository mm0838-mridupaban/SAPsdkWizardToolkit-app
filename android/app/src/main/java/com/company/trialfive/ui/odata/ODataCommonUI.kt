package com.company.trialfive.ui.odata

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import com.company.trialfive.R
import com.sap.cloud.android.odata.northwindentities.NorthwindEntitiesMetadata.EntityTypes
import com.sap.cloud.android.odata.northwindentities.NorthwindEntitiesMetadata.EntitySets
import com.company.trialfive.ui.odata.screens.alphabeticallistofproduct.AlphabeticalListOfProductEntitiesScreen
import com.company.trialfive.ui.odata.screens.alphabeticallistofproduct.AlphabeticalListOfProductEntityEditScreen
import com.company.trialfive.ui.odata.screens.alphabeticallistofproduct.AlphabeticalListOfProductEntityDetailScreen
import com.company.trialfive.ui.odata.screens.alphabeticallistofproduct.AlphabeticalListOfProductEntitiesExpandScreen
import com.company.trialfive.ui.odata.screens.category.CategoryEntitiesScreen
import com.company.trialfive.ui.odata.screens.category.CategoryEntityEditScreen
import com.company.trialfive.ui.odata.screens.category.CategoryEntityDetailScreen
import com.company.trialfive.ui.odata.screens.category.CategoryEntitiesExpandScreen
import com.company.trialfive.ui.odata.screens.categorysalesfor1997.CategorySalesFor1997EntitiesScreen
import com.company.trialfive.ui.odata.screens.categorysalesfor1997.CategorySalesFor1997EntityEditScreen
import com.company.trialfive.ui.odata.screens.categorysalesfor1997.CategorySalesFor1997EntityDetailScreen
import com.company.trialfive.ui.odata.screens.categorysalesfor1997.CategorySalesFor1997EntitiesExpandScreen
import com.company.trialfive.ui.odata.screens.currentproductlist.CurrentProductListEntitiesScreen
import com.company.trialfive.ui.odata.screens.currentproductlist.CurrentProductListEntityEditScreen
import com.company.trialfive.ui.odata.screens.currentproductlist.CurrentProductListEntityDetailScreen
import com.company.trialfive.ui.odata.screens.currentproductlist.CurrentProductListEntitiesExpandScreen
import com.company.trialfive.ui.odata.screens.customerandsuppliersbycity.CustomerAndSuppliersByCityEntitiesScreen
import com.company.trialfive.ui.odata.screens.customerandsuppliersbycity.CustomerAndSuppliersByCityEntityEditScreen
import com.company.trialfive.ui.odata.screens.customerandsuppliersbycity.CustomerAndSuppliersByCityEntityDetailScreen
import com.company.trialfive.ui.odata.screens.customerandsuppliersbycity.CustomerAndSuppliersByCityEntitiesExpandScreen
import com.company.trialfive.ui.odata.screens.customerdemographic.CustomerDemographicEntitiesScreen
import com.company.trialfive.ui.odata.screens.customerdemographic.CustomerDemographicEntityEditScreen
import com.company.trialfive.ui.odata.screens.customerdemographic.CustomerDemographicEntityDetailScreen
import com.company.trialfive.ui.odata.screens.customerdemographic.CustomerDemographicEntitiesExpandScreen
import com.company.trialfive.ui.odata.screens.customer.CustomerEntitiesScreen
import com.company.trialfive.ui.odata.screens.customer.CustomerEntityEditScreen
import com.company.trialfive.ui.odata.screens.customer.CustomerEntityDetailScreen
import com.company.trialfive.ui.odata.screens.customer.CustomerEntitiesExpandScreen
import com.company.trialfive.ui.odata.screens.employee.EmployeeEntitiesScreen
import com.company.trialfive.ui.odata.screens.employee.EmployeeEntityEditScreen
import com.company.trialfive.ui.odata.screens.employee.EmployeeEntityDetailScreen
import com.company.trialfive.ui.odata.screens.employee.EmployeeEntitiesExpandScreen
import com.company.trialfive.ui.odata.screens.invoice.InvoiceEntitiesScreen
import com.company.trialfive.ui.odata.screens.invoice.InvoiceEntityEditScreen
import com.company.trialfive.ui.odata.screens.invoice.InvoiceEntityDetailScreen
import com.company.trialfive.ui.odata.screens.invoice.InvoiceEntitiesExpandScreen
import com.company.trialfive.ui.odata.screens.orderdetail.OrderDetailEntitiesScreen
import com.company.trialfive.ui.odata.screens.orderdetail.OrderDetailEntityEditScreen
import com.company.trialfive.ui.odata.screens.orderdetail.OrderDetailEntityDetailScreen
import com.company.trialfive.ui.odata.screens.orderdetail.OrderDetailEntitiesExpandScreen
import com.company.trialfive.ui.odata.screens.orderdetailsextended.OrderDetailsExtendedEntitiesScreen
import com.company.trialfive.ui.odata.screens.orderdetailsextended.OrderDetailsExtendedEntityEditScreen
import com.company.trialfive.ui.odata.screens.orderdetailsextended.OrderDetailsExtendedEntityDetailScreen
import com.company.trialfive.ui.odata.screens.orderdetailsextended.OrderDetailsExtendedEntitiesExpandScreen
import com.company.trialfive.ui.odata.screens.ordersubtotal.OrderSubtotalEntitiesScreen
import com.company.trialfive.ui.odata.screens.ordersubtotal.OrderSubtotalEntityEditScreen
import com.company.trialfive.ui.odata.screens.ordersubtotal.OrderSubtotalEntityDetailScreen
import com.company.trialfive.ui.odata.screens.ordersubtotal.OrderSubtotalEntitiesExpandScreen
import com.company.trialfive.ui.odata.screens.order.OrderEntitiesScreen
import com.company.trialfive.ui.odata.screens.order.OrderEntityEditScreen
import com.company.trialfive.ui.odata.screens.order.OrderEntityDetailScreen
import com.company.trialfive.ui.odata.screens.order.OrderEntitiesExpandScreen
import com.company.trialfive.ui.odata.screens.ordersqry.OrdersQryEntitiesScreen
import com.company.trialfive.ui.odata.screens.ordersqry.OrdersQryEntityEditScreen
import com.company.trialfive.ui.odata.screens.ordersqry.OrdersQryEntityDetailScreen
import com.company.trialfive.ui.odata.screens.ordersqry.OrdersQryEntitiesExpandScreen
import com.company.trialfive.ui.odata.screens.productsalesfor1997.ProductSalesFor1997EntitiesScreen
import com.company.trialfive.ui.odata.screens.productsalesfor1997.ProductSalesFor1997EntityEditScreen
import com.company.trialfive.ui.odata.screens.productsalesfor1997.ProductSalesFor1997EntityDetailScreen
import com.company.trialfive.ui.odata.screens.productsalesfor1997.ProductSalesFor1997EntitiesExpandScreen
import com.company.trialfive.ui.odata.screens.product.ProductEntitiesScreen
import com.company.trialfive.ui.odata.screens.product.ProductEntityEditScreen
import com.company.trialfive.ui.odata.screens.product.ProductEntityDetailScreen
import com.company.trialfive.ui.odata.screens.product.ProductEntitiesExpandScreen
import com.company.trialfive.ui.odata.screens.productsaboveaverageprice.ProductsAboveAveragePriceEntitiesScreen
import com.company.trialfive.ui.odata.screens.productsaboveaverageprice.ProductsAboveAveragePriceEntityEditScreen
import com.company.trialfive.ui.odata.screens.productsaboveaverageprice.ProductsAboveAveragePriceEntityDetailScreen
import com.company.trialfive.ui.odata.screens.productsaboveaverageprice.ProductsAboveAveragePriceEntitiesExpandScreen
import com.company.trialfive.ui.odata.screens.productsbycategory.ProductsByCategoryEntitiesScreen
import com.company.trialfive.ui.odata.screens.productsbycategory.ProductsByCategoryEntityEditScreen
import com.company.trialfive.ui.odata.screens.productsbycategory.ProductsByCategoryEntityDetailScreen
import com.company.trialfive.ui.odata.screens.productsbycategory.ProductsByCategoryEntitiesExpandScreen
import com.company.trialfive.ui.odata.screens.region.RegionEntitiesScreen
import com.company.trialfive.ui.odata.screens.region.RegionEntityEditScreen
import com.company.trialfive.ui.odata.screens.region.RegionEntityDetailScreen
import com.company.trialfive.ui.odata.screens.region.RegionEntitiesExpandScreen
import com.company.trialfive.ui.odata.screens.salesbycategory.SalesByCategoryEntitiesScreen
import com.company.trialfive.ui.odata.screens.salesbycategory.SalesByCategoryEntityEditScreen
import com.company.trialfive.ui.odata.screens.salesbycategory.SalesByCategoryEntityDetailScreen
import com.company.trialfive.ui.odata.screens.salesbycategory.SalesByCategoryEntitiesExpandScreen
import com.company.trialfive.ui.odata.screens.salestotalsbyamount.SalesTotalsByAmountEntitiesScreen
import com.company.trialfive.ui.odata.screens.salestotalsbyamount.SalesTotalsByAmountEntityEditScreen
import com.company.trialfive.ui.odata.screens.salestotalsbyamount.SalesTotalsByAmountEntityDetailScreen
import com.company.trialfive.ui.odata.screens.salestotalsbyamount.SalesTotalsByAmountEntitiesExpandScreen
import com.company.trialfive.ui.odata.screens.shipper.ShipperEntitiesScreen
import com.company.trialfive.ui.odata.screens.shipper.ShipperEntityEditScreen
import com.company.trialfive.ui.odata.screens.shipper.ShipperEntityDetailScreen
import com.company.trialfive.ui.odata.screens.shipper.ShipperEntitiesExpandScreen
import com.company.trialfive.ui.odata.screens.summaryofsalesbyquarter.SummaryOfSalesByQuarterEntitiesScreen
import com.company.trialfive.ui.odata.screens.summaryofsalesbyquarter.SummaryOfSalesByQuarterEntityEditScreen
import com.company.trialfive.ui.odata.screens.summaryofsalesbyquarter.SummaryOfSalesByQuarterEntityDetailScreen
import com.company.trialfive.ui.odata.screens.summaryofsalesbyquarter.SummaryOfSalesByQuarterEntitiesExpandScreen
import com.company.trialfive.ui.odata.screens.summaryofsalesbyyear.SummaryOfSalesByYearEntitiesScreen
import com.company.trialfive.ui.odata.screens.summaryofsalesbyyear.SummaryOfSalesByYearEntityEditScreen
import com.company.trialfive.ui.odata.screens.summaryofsalesbyyear.SummaryOfSalesByYearEntityDetailScreen
import com.company.trialfive.ui.odata.screens.summaryofsalesbyyear.SummaryOfSalesByYearEntitiesExpandScreen
import com.company.trialfive.ui.odata.screens.supplier.SupplierEntitiesScreen
import com.company.trialfive.ui.odata.screens.supplier.SupplierEntityEditScreen
import com.company.trialfive.ui.odata.screens.supplier.SupplierEntityDetailScreen
import com.company.trialfive.ui.odata.screens.supplier.SupplierEntitiesExpandScreen
import com.company.trialfive.ui.odata.screens.territory.TerritoryEntitiesScreen
import com.company.trialfive.ui.odata.screens.territory.TerritoryEntityEditScreen
import com.company.trialfive.ui.odata.screens.territory.TerritoryEntityDetailScreen
import com.company.trialfive.ui.odata.screens.territory.TerritoryEntitiesExpandScreen
import com.company.trialfive.ui.odata.viewmodel.ODataViewModel
import com.sap.cloud.mobile.kotlin.odata.EntitySet
import com.sap.cloud.mobile.kotlin.odata.EntityType
import com.sap.cloud.mobile.kotlin.odata.EntityValue
import com.sap.cloud.mobile.kotlin.odata.NavigationProperty

/*
enum class EntityTypeScreenInfo(
    val entityType: EntityType, val setTitleId: Int, val itemTitleId: Int, val iconId: Int
) {
    AlphabeticalListOfProducts(
        EntityTypes.alphabeticalListOfProduct,
        R.string.eset_alphabeticallistofproducts,
        R.string.eset_alphabeticallistofproducts_single,
        R.drawable.ic_sap_icon_product_filled_round
        ),
    Categories(
        EntityTypes.category,
        R.string.eset_categories,
        R.string.eset_categories_single,
        R.drawable.ic_sap_icon_product_outlined
        ),
    CategorySalesFor1997(
        EntityTypes.categorySalesFor1997,
        R.string.eset_categorysalesfor1997,
        R.string.eset_categorysalesfor1997_single,
        R.drawable.ic_sap_icon_product_filled_round
        ),
    CurrentProductLists(
        EntityTypes.currentProductList,
        R.string.eset_currentproductlists,
        R.string.eset_currentproductlists_single,
        R.drawable.ic_sap_icon_product_outlined
        ),
    CustomerAndSuppliersByCities(
        EntityTypes.customerAndSuppliersByCity,
        R.string.eset_customerandsuppliersbycities,
        R.string.eset_customerandsuppliersbycities_single,
        R.drawable.ic_sap_icon_product_filled_round
        ),
    CustomerDemographics(
        EntityTypes.customerDemographic,
        R.string.eset_customerdemographics,
        R.string.eset_customerdemographics_single,
        R.drawable.ic_sap_icon_product_outlined
        ),
    Customers(
        EntityTypes.customer,
        R.string.eset_customers,
        R.string.eset_customers_single,
        R.drawable.ic_sap_icon_product_filled_round
        ),
    Employees(
        EntityTypes.employee,
        R.string.eset_employees,
        R.string.eset_employees_single,
        R.drawable.ic_sap_icon_product_outlined
        ),
    Invoices(
        EntityTypes.invoice,
        R.string.eset_invoices,
        R.string.eset_invoices_single,
        R.drawable.ic_sap_icon_product_filled_round
        ),
    OrderDetails(
        EntityTypes.orderDetail,
        R.string.eset_orderdetails,
        R.string.eset_orderdetails_single,
        R.drawable.ic_sap_icon_product_outlined
        ),
    OrderDetailsExtendeds(
        EntityTypes.orderDetailsExtended,
        R.string.eset_orderdetailsextendeds,
        R.string.eset_orderdetailsextendeds_single,
        R.drawable.ic_sap_icon_product_filled_round
        ),
    OrderSubtotals(
        EntityTypes.orderSubtotal,
        R.string.eset_ordersubtotals,
        R.string.eset_ordersubtotals_single,
        R.drawable.ic_sap_icon_product_outlined
        ),
    Orders(
        EntityTypes.order,
        R.string.eset_orders,
        R.string.eset_orders_single,
        R.drawable.ic_sap_icon_product_filled_round
        ),
    OrdersQries(
        EntityTypes.ordersQry,
        R.string.eset_ordersqries,
        R.string.eset_ordersqries_single,
        R.drawable.ic_sap_icon_product_outlined
        ),
    ProductSalesFor1997(
        EntityTypes.productSalesFor1997,
        R.string.eset_productsalesfor1997,
        R.string.eset_productsalesfor1997_single,
        R.drawable.ic_sap_icon_product_filled_round
        ),
    Products(
        EntityTypes.product,
        R.string.eset_products,
        R.string.eset_products_single,
        R.drawable.ic_sap_icon_product_outlined
        ),
    ProductsAboveAveragePrices(
        EntityTypes.productsAboveAveragePrice,
        R.string.eset_productsaboveaverageprices,
        R.string.eset_productsaboveaverageprices_single,
        R.drawable.ic_sap_icon_product_filled_round
        ),
    ProductsByCategories(
        EntityTypes.productsByCategory,
        R.string.eset_productsbycategories,
        R.string.eset_productsbycategories_single,
        R.drawable.ic_sap_icon_product_outlined
        ),
    Regions(
        EntityTypes.region,
        R.string.eset_regions,
        R.string.eset_regions_single,
        R.drawable.ic_sap_icon_product_filled_round
        ),
    SalesByCategories(
        EntityTypes.salesByCategory,
        R.string.eset_salesbycategories,
        R.string.eset_salesbycategories_single,
        R.drawable.ic_sap_icon_product_outlined
        ),
    SalesTotalsByAmounts(
        EntityTypes.salesTotalsByAmount,
        R.string.eset_salestotalsbyamounts,
        R.string.eset_salestotalsbyamounts_single,
        R.drawable.ic_sap_icon_product_filled_round
        ),
    Shippers(
        EntityTypes.shipper,
        R.string.eset_shippers,
        R.string.eset_shippers_single,
        R.drawable.ic_sap_icon_product_outlined
        ),
    SummaryOfSalesByQuarters(
        EntityTypes.summaryOfSalesByQuarter,
        R.string.eset_summaryofsalesbyquarters,
        R.string.eset_summaryofsalesbyquarters_single,
        R.drawable.ic_sap_icon_product_filled_round
        ),
    SummaryOfSalesByYears(
        EntityTypes.summaryOfSalesByYear,
        R.string.eset_summaryofsalesbyyears,
        R.string.eset_summaryofsalesbyyears_single,
        R.drawable.ic_sap_icon_product_outlined
        ),
    Suppliers(
        EntityTypes.supplier,
        R.string.eset_suppliers,
        R.string.eset_suppliers_single,
        R.drawable.ic_sap_icon_product_filled_round
        ),
    Territories(
        EntityTypes.territory,
        R.string.eset_territories,
        R.string.eset_territories_single,
        R.drawable.ic_sap_icon_product_outlined
        )
}*/

enum class EntityScreenInfo(
    val entityType: EntityType,
    val entitySet: EntitySet?,
    val setTitleId: Int, val itemTitleId: Int, val iconId: Int,
    val entityExpandScreen: @Composable (
        navigateToHome: () -> Unit,
        navigateUp: () -> Unit,
        onNavigateProperty: (EntityValue, NavigationProperty) -> Unit,
        viewModel: ODataViewModel,
    ) -> Unit,
    val entityListScreen: @Composable (
        navigateToHome: () -> Unit,
        navigateUp: () -> Unit,
        viewModel: ODataViewModel,
        isExpandedScreen: Boolean
    ) -> Unit,
    val entityEditScreen: @Composable (
        navigateUp: () -> Unit, viewModel: ODataViewModel, isExpandedScreen: Boolean
    ) -> Unit,
    val entityDetailScreen: @Composable (
        onNavigateProperty: (EntityValue, NavigationProperty) -> Unit, navigateUp: () -> Unit, viewModel: ODataViewModel, isExpandedScreen: Boolean
    ) -> Unit,
) {
    AlphabeticalListOfProducts(
        EntityTypes.alphabeticalListOfProduct,
        EntitySets.alphabeticalListOfProducts,
        R.string.eset_alphabeticallistofproducts,
        R.string.eset_alphabeticallistofproducts_single,
        R.drawable.ic_sap_icon_product_filled_round,
        AlphabeticalListOfProductEntitiesExpandScreen,
        AlphabeticalListOfProductEntitiesScreen,
        AlphabeticalListOfProductEntityEditScreen,
        AlphabeticalListOfProductEntityDetailScreen
    ),
    Categories(
        EntityTypes.category,
        EntitySets.categories,
        R.string.eset_categories,
        R.string.eset_categories_single,
        R.drawable.ic_sap_icon_product_outlined,
        CategoryEntitiesExpandScreen,
        CategoryEntitiesScreen,
        CategoryEntityEditScreen,
        CategoryEntityDetailScreen
    ),
    CategorySalesFor1997(
        EntityTypes.categorySalesFor1997,
        EntitySets.categorySalesFor1997,
        R.string.eset_categorysalesfor1997,
        R.string.eset_categorysalesfor1997_single,
        R.drawable.ic_sap_icon_product_filled_round,
        CategorySalesFor1997EntitiesExpandScreen,
        CategorySalesFor1997EntitiesScreen,
        CategorySalesFor1997EntityEditScreen,
        CategorySalesFor1997EntityDetailScreen
    ),
    CurrentProductLists(
        EntityTypes.currentProductList,
        EntitySets.currentProductLists,
        R.string.eset_currentproductlists,
        R.string.eset_currentproductlists_single,
        R.drawable.ic_sap_icon_product_outlined,
        CurrentProductListEntitiesExpandScreen,
        CurrentProductListEntitiesScreen,
        CurrentProductListEntityEditScreen,
        CurrentProductListEntityDetailScreen
    ),
    CustomerAndSuppliersByCities(
        EntityTypes.customerAndSuppliersByCity,
        EntitySets.customerAndSuppliersByCities,
        R.string.eset_customerandsuppliersbycities,
        R.string.eset_customerandsuppliersbycities_single,
        R.drawable.ic_sap_icon_product_filled_round,
        CustomerAndSuppliersByCityEntitiesExpandScreen,
        CustomerAndSuppliersByCityEntitiesScreen,
        CustomerAndSuppliersByCityEntityEditScreen,
        CustomerAndSuppliersByCityEntityDetailScreen
    ),
    CustomerDemographics(
        EntityTypes.customerDemographic,
        EntitySets.customerDemographics,
        R.string.eset_customerdemographics,
        R.string.eset_customerdemographics_single,
        R.drawable.ic_sap_icon_product_outlined,
        CustomerDemographicEntitiesExpandScreen,
        CustomerDemographicEntitiesScreen,
        CustomerDemographicEntityEditScreen,
        CustomerDemographicEntityDetailScreen
    ),
    Customers(
        EntityTypes.customer,
        EntitySets.customers,
        R.string.eset_customers,
        R.string.eset_customers_single,
        R.drawable.ic_sap_icon_product_filled_round,
        CustomerEntitiesExpandScreen,
        CustomerEntitiesScreen,
        CustomerEntityEditScreen,
        CustomerEntityDetailScreen
    ),
    Employees(
        EntityTypes.employee,
        EntitySets.employees,
        R.string.eset_employees,
        R.string.eset_employees_single,
        R.drawable.ic_sap_icon_product_outlined,
        EmployeeEntitiesExpandScreen,
        EmployeeEntitiesScreen,
        EmployeeEntityEditScreen,
        EmployeeEntityDetailScreen
    ),
    Invoices(
        EntityTypes.invoice,
        EntitySets.invoices,
        R.string.eset_invoices,
        R.string.eset_invoices_single,
        R.drawable.ic_sap_icon_product_filled_round,
        InvoiceEntitiesExpandScreen,
        InvoiceEntitiesScreen,
        InvoiceEntityEditScreen,
        InvoiceEntityDetailScreen
    ),
    OrderDetails(
        EntityTypes.orderDetail,
        EntitySets.orderDetails,
        R.string.eset_orderdetails,
        R.string.eset_orderdetails_single,
        R.drawable.ic_sap_icon_product_outlined,
        OrderDetailEntitiesExpandScreen,
        OrderDetailEntitiesScreen,
        OrderDetailEntityEditScreen,
        OrderDetailEntityDetailScreen
    ),
    OrderDetailsExtendeds(
        EntityTypes.orderDetailsExtended,
        EntitySets.orderDetailsExtendeds,
        R.string.eset_orderdetailsextendeds,
        R.string.eset_orderdetailsextendeds_single,
        R.drawable.ic_sap_icon_product_filled_round,
        OrderDetailsExtendedEntitiesExpandScreen,
        OrderDetailsExtendedEntitiesScreen,
        OrderDetailsExtendedEntityEditScreen,
        OrderDetailsExtendedEntityDetailScreen
    ),
    OrderSubtotals(
        EntityTypes.orderSubtotal,
        EntitySets.orderSubtotals,
        R.string.eset_ordersubtotals,
        R.string.eset_ordersubtotals_single,
        R.drawable.ic_sap_icon_product_outlined,
        OrderSubtotalEntitiesExpandScreen,
        OrderSubtotalEntitiesScreen,
        OrderSubtotalEntityEditScreen,
        OrderSubtotalEntityDetailScreen
    ),
    Orders(
        EntityTypes.order,
        EntitySets.orders,
        R.string.eset_orders,
        R.string.eset_orders_single,
        R.drawable.ic_sap_icon_product_filled_round,
        OrderEntitiesExpandScreen,
        OrderEntitiesScreen,
        OrderEntityEditScreen,
        OrderEntityDetailScreen
    ),
    OrdersQries(
        EntityTypes.ordersQry,
        EntitySets.ordersQries,
        R.string.eset_ordersqries,
        R.string.eset_ordersqries_single,
        R.drawable.ic_sap_icon_product_outlined,
        OrdersQryEntitiesExpandScreen,
        OrdersQryEntitiesScreen,
        OrdersQryEntityEditScreen,
        OrdersQryEntityDetailScreen
    ),
    ProductSalesFor1997(
        EntityTypes.productSalesFor1997,
        EntitySets.productSalesFor1997,
        R.string.eset_productsalesfor1997,
        R.string.eset_productsalesfor1997_single,
        R.drawable.ic_sap_icon_product_filled_round,
        ProductSalesFor1997EntitiesExpandScreen,
        ProductSalesFor1997EntitiesScreen,
        ProductSalesFor1997EntityEditScreen,
        ProductSalesFor1997EntityDetailScreen
    ),
    Products(
        EntityTypes.product,
        EntitySets.products,
        R.string.eset_products,
        R.string.eset_products_single,
        R.drawable.ic_sap_icon_product_outlined,
        ProductEntitiesExpandScreen,
        ProductEntitiesScreen,
        ProductEntityEditScreen,
        ProductEntityDetailScreen
    ),
    ProductsAboveAveragePrices(
        EntityTypes.productsAboveAveragePrice,
        EntitySets.productsAboveAveragePrices,
        R.string.eset_productsaboveaverageprices,
        R.string.eset_productsaboveaverageprices_single,
        R.drawable.ic_sap_icon_product_filled_round,
        ProductsAboveAveragePriceEntitiesExpandScreen,
        ProductsAboveAveragePriceEntitiesScreen,
        ProductsAboveAveragePriceEntityEditScreen,
        ProductsAboveAveragePriceEntityDetailScreen
    ),
    ProductsByCategories(
        EntityTypes.productsByCategory,
        EntitySets.productsByCategories,
        R.string.eset_productsbycategories,
        R.string.eset_productsbycategories_single,
        R.drawable.ic_sap_icon_product_outlined,
        ProductsByCategoryEntitiesExpandScreen,
        ProductsByCategoryEntitiesScreen,
        ProductsByCategoryEntityEditScreen,
        ProductsByCategoryEntityDetailScreen
    ),
    Regions(
        EntityTypes.region,
        EntitySets.regions,
        R.string.eset_regions,
        R.string.eset_regions_single,
        R.drawable.ic_sap_icon_product_filled_round,
        RegionEntitiesExpandScreen,
        RegionEntitiesScreen,
        RegionEntityEditScreen,
        RegionEntityDetailScreen
    ),
    SalesByCategories(
        EntityTypes.salesByCategory,
        EntitySets.salesByCategories,
        R.string.eset_salesbycategories,
        R.string.eset_salesbycategories_single,
        R.drawable.ic_sap_icon_product_outlined,
        SalesByCategoryEntitiesExpandScreen,
        SalesByCategoryEntitiesScreen,
        SalesByCategoryEntityEditScreen,
        SalesByCategoryEntityDetailScreen
    ),
    SalesTotalsByAmounts(
        EntityTypes.salesTotalsByAmount,
        EntitySets.salesTotalsByAmounts,
        R.string.eset_salestotalsbyamounts,
        R.string.eset_salestotalsbyamounts_single,
        R.drawable.ic_sap_icon_product_filled_round,
        SalesTotalsByAmountEntitiesExpandScreen,
        SalesTotalsByAmountEntitiesScreen,
        SalesTotalsByAmountEntityEditScreen,
        SalesTotalsByAmountEntityDetailScreen
    ),
    Shippers(
        EntityTypes.shipper,
        EntitySets.shippers,
        R.string.eset_shippers,
        R.string.eset_shippers_single,
        R.drawable.ic_sap_icon_product_outlined,
        ShipperEntitiesExpandScreen,
        ShipperEntitiesScreen,
        ShipperEntityEditScreen,
        ShipperEntityDetailScreen
    ),
    SummaryOfSalesByQuarters(
        EntityTypes.summaryOfSalesByQuarter,
        EntitySets.summaryOfSalesByQuarters,
        R.string.eset_summaryofsalesbyquarters,
        R.string.eset_summaryofsalesbyquarters_single,
        R.drawable.ic_sap_icon_product_filled_round,
        SummaryOfSalesByQuarterEntitiesExpandScreen,
        SummaryOfSalesByQuarterEntitiesScreen,
        SummaryOfSalesByQuarterEntityEditScreen,
        SummaryOfSalesByQuarterEntityDetailScreen
    ),
    SummaryOfSalesByYears(
        EntityTypes.summaryOfSalesByYear,
        EntitySets.summaryOfSalesByYears,
        R.string.eset_summaryofsalesbyyears,
        R.string.eset_summaryofsalesbyyears_single,
        R.drawable.ic_sap_icon_product_outlined,
        SummaryOfSalesByYearEntitiesExpandScreen,
        SummaryOfSalesByYearEntitiesScreen,
        SummaryOfSalesByYearEntityEditScreen,
        SummaryOfSalesByYearEntityDetailScreen
    ),
    Suppliers(
        EntityTypes.supplier,
        EntitySets.suppliers,
        R.string.eset_suppliers,
        R.string.eset_suppliers_single,
        R.drawable.ic_sap_icon_product_filled_round,
        SupplierEntitiesExpandScreen,
        SupplierEntitiesScreen,
        SupplierEntityEditScreen,
        SupplierEntityDetailScreen
    ),
    Territories(
        EntityTypes.territory,
        EntitySets.territories,
        R.string.eset_territories,
        R.string.eset_territories_single,
        R.drawable.ic_sap_icon_product_outlined,
        TerritoryEntitiesExpandScreen,
        TerritoryEntitiesScreen,
        TerritoryEntityEditScreen,
        TerritoryEntityDetailScreen
    ),
}

fun getEntitySetScreenInfoList(): List<EntityScreenInfo> {
    val metadataMap = EntityMetaData.entries.associateBy { it.entityType }
    return EntityScreenInfo.entries.filter { metadataMap[it.entityType]?.entitySet != null }
}

// return screen info according to specified entity type and entity set
fun getEntityScreenInfo(entityType: EntityType, entitySet: EntitySet?): EntityScreenInfo =
    EntityScreenInfo.entries.first { getKey(entityType, entitySet) == getKey(it.entityType, it.entitySet) }

enum class ScreenType {
    List, Details, Update, Create, NavigatedList
}

@Composable
fun screenTitle(entitySetScreenInfo: EntityScreenInfo, screenType: ScreenType): String {
    return when (screenType) {
        //TODO: navigated list title?
        ScreenType.List, ScreenType.NavigatedList -> stringResource(id = entitySetScreenInfo.setTitleId)
        ScreenType.Details -> stringResource(id = entitySetScreenInfo.itemTitleId)
        ScreenType.Update -> stringResource(id = R.string.title_update_fragment) + " ${
            stringResource(
                id = entitySetScreenInfo.itemTitleId
            )
        }"
        ScreenType.Create -> stringResource(
            id = R.string.title_create_fragment,
            stringResource(id = entitySetScreenInfo.itemTitleId)
        )
    }
}
