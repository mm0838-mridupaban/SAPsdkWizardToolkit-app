package com.company.trialfive.ui.odata

import com.sap.cloud.android.odata.northwindentities.NorthwindEntitiesMetadata.EntitySets
import com.sap.cloud.mobile.kotlin.odata.EntitySet
import com.sap.cloud.mobile.kotlin.odata.EntityType
import com.sap.cloud.mobile.kotlin.odata.Property
import com.sap.cloud.android.odata.northwindentities.NorthwindEntitiesMetadata.EntityTypes

enum class EntityMetaData(
    val entityType: EntityType,
    val orderByProperty: Property?,
    val entitySet: EntitySet? = null,
) {
    AlphabeticalListOfProducts(
        EntityTypes.alphabeticalListOfProduct,
        com.sap.cloud.android.odata.northwindentities.AlphabeticalListOfProduct.supplierID,
        EntitySets.alphabeticalListOfProducts,
        ),
    Categories(
        EntityTypes.category,
        com.sap.cloud.android.odata.northwindentities.Category.categoryName,
        EntitySets.categories,
        ),
    CategorySalesFor1997(
        EntityTypes.categorySalesFor1997,
        com.sap.cloud.android.odata.northwindentities.CategorySalesFor1997.categorySales,
        EntitySets.categorySalesFor1997,
        ),
    CurrentProductLists(
        EntityTypes.currentProductList,
        com.sap.cloud.android.odata.northwindentities.CurrentProductList.productID,
        EntitySets.currentProductLists,
        ),
    CustomerAndSuppliersByCities(
        EntityTypes.customerAndSuppliersByCity,
        com.sap.cloud.android.odata.northwindentities.CustomerAndSuppliersByCity.city,
        EntitySets.customerAndSuppliersByCities,
        ),
    CustomerDemographics(
        EntityTypes.customerDemographic,
        com.sap.cloud.android.odata.northwindentities.CustomerDemographic.customerDesc,
        EntitySets.customerDemographics,
        ),
    Customers(
        EntityTypes.customer,
        com.sap.cloud.android.odata.northwindentities.Customer.companyName,
        EntitySets.customers,
        ),
    Employees(
        EntityTypes.employee,
        com.sap.cloud.android.odata.northwindentities.Employee.lastName,
        EntitySets.employees,
        ),
    Invoices(
        EntityTypes.invoice,
        com.sap.cloud.android.odata.northwindentities.Invoice.shipName,
        EntitySets.invoices,
        ),
    OrderDetails(
        EntityTypes.orderDetail,
        com.sap.cloud.android.odata.northwindentities.OrderDetail.unitPrice,
        EntitySets.orderDetails,
        ),
    OrderDetailsExtendeds(
        EntityTypes.orderDetailsExtended,
        com.sap.cloud.android.odata.northwindentities.OrderDetailsExtended.extendedPrice,
        EntitySets.orderDetailsExtendeds,
        ),
    OrderSubtotals(
        EntityTypes.orderSubtotal,
        com.sap.cloud.android.odata.northwindentities.OrderSubtotal.subtotal,
        EntitySets.orderSubtotals,
        ),
    Orders(
        EntityTypes.order,
        com.sap.cloud.android.odata.northwindentities.Order.customerID,
        EntitySets.orders,
        ),
    OrdersQries(
        EntityTypes.ordersQry,
        com.sap.cloud.android.odata.northwindentities.OrdersQry.customerID,
        EntitySets.ordersQries,
        ),
    ProductSalesFor1997(
        EntityTypes.productSalesFor1997,
        com.sap.cloud.android.odata.northwindentities.ProductSalesFor1997.productSales,
        EntitySets.productSalesFor1997,
        ),
    Products(
        EntityTypes.product,
        com.sap.cloud.android.odata.northwindentities.Product.productName,
        EntitySets.products,
        ),
    ProductsAboveAveragePrices(
        EntityTypes.productsAboveAveragePrice,
        com.sap.cloud.android.odata.northwindentities.ProductsAboveAveragePrice.unitPrice,
        EntitySets.productsAboveAveragePrices,
        ),
    ProductsByCategories(
        EntityTypes.productsByCategory,
        com.sap.cloud.android.odata.northwindentities.ProductsByCategory.quantityPerUnit,
        EntitySets.productsByCategories,
        ),
    Regions(
        EntityTypes.region,
        com.sap.cloud.android.odata.northwindentities.Region.regionDescription,
        EntitySets.regions,
        ),
    SalesByCategories(
        EntityTypes.salesByCategory,
        com.sap.cloud.android.odata.northwindentities.SalesByCategory.productSales,
        EntitySets.salesByCategories,
        ),
    SalesTotalsByAmounts(
        EntityTypes.salesTotalsByAmount,
        com.sap.cloud.android.odata.northwindentities.SalesTotalsByAmount.saleAmount,
        EntitySets.salesTotalsByAmounts,
        ),
    Shippers(
        EntityTypes.shipper,
        com.sap.cloud.android.odata.northwindentities.Shipper.companyName,
        EntitySets.shippers,
        ),
    SummaryOfSalesByQuarters(
        EntityTypes.summaryOfSalesByQuarter,
        com.sap.cloud.android.odata.northwindentities.SummaryOfSalesByQuarter.shippedDate,
        EntitySets.summaryOfSalesByQuarters,
        ),
    SummaryOfSalesByYears(
        EntityTypes.summaryOfSalesByYear,
        com.sap.cloud.android.odata.northwindentities.SummaryOfSalesByYear.shippedDate,
        EntitySets.summaryOfSalesByYears,
        ),
    Suppliers(
        EntityTypes.supplier,
        com.sap.cloud.android.odata.northwindentities.Supplier.companyName,
        EntitySets.suppliers,
        ),
    Territories(
        EntityTypes.territory,
        com.sap.cloud.android.odata.northwindentities.Territory.territoryDescription,
        EntitySets.territories,
        ),
}

fun getOrderByProperty(entityType: EntityType): Property? {
    return EntityMetaData.entries.first { it.entityType == entityType }.orderByProperty
}

fun getKey(entityType: EntityType, entitySet: EntitySet? = null): String {
    return "${entitySet?.localName}_${entityType.localName}"
}