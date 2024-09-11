package com.company.trialfive.repository

import com.company.trialfive.service.SAPServiceManager
import com.sap.cloud.android.odata.northwindentities.NorthwindEntitiesMetadata.EntitySets
import com.sap.cloud.android.odata.northwindentities.NorthwindEntitiesMetadata.EntityTypes
import com.company.trialfive.ui.odata.getKey
import com.sap.cloud.mobile.kotlin.odata.EntitySet
import com.sap.cloud.mobile.kotlin.odata.EntityType
import com.sap.cloud.mobile.kotlin.odata.Property

import java.util.WeakHashMap

/*
 * Repository factory to construct repository for an entity set
 */
object RepositoryFactory
/**
 * Construct a RepositoryFactory instance. There should only be one repository factory and used
 * throughout the life of the application to avoid caching entities multiple times.
 */
{
    private val repositories: WeakHashMap<String, Repository> = WeakHashMap()

    /**
     * Construct or return an existing repository for the specified entity set
     * @param entitySet - entity set for which the repository is to be returned
     * @param orderByProperty - if specified, collection will be sorted ascending with this property
     * @return a repository for the entity set
     */
    fun getRepository(entityType: EntityType, entitySet: EntitySet?, orderByProperty: Property?): Repository {
        val northwindEntities = SAPServiceManager.northwindEntities!!
        val key = getKey(entityType, entitySet)
        var repository: Repository? = repositories[key]
        if (repository == null) {
            repository = when (key) {
                getKey(EntityTypes.alphabeticalListOfProduct, EntitySets.alphabeticalListOfProducts) ->
                    Repository(northwindEntities, EntityTypes.alphabeticalListOfProduct, EntitySets.alphabeticalListOfProducts, orderByProperty)
                getKey(EntityTypes.category, EntitySets.categories) ->
                    Repository(northwindEntities, EntityTypes.category, EntitySets.categories, orderByProperty)
                getKey(EntityTypes.categorySalesFor1997, EntitySets.categorySalesFor1997) ->
                    Repository(northwindEntities, EntityTypes.categorySalesFor1997, EntitySets.categorySalesFor1997, orderByProperty)
                getKey(EntityTypes.currentProductList, EntitySets.currentProductLists) ->
                    Repository(northwindEntities, EntityTypes.currentProductList, EntitySets.currentProductLists, orderByProperty)
                getKey(EntityTypes.customerAndSuppliersByCity, EntitySets.customerAndSuppliersByCities) ->
                    Repository(northwindEntities, EntityTypes.customerAndSuppliersByCity, EntitySets.customerAndSuppliersByCities, orderByProperty)
                getKey(EntityTypes.customerDemographic, EntitySets.customerDemographics) ->
                    Repository(northwindEntities, EntityTypes.customerDemographic, EntitySets.customerDemographics, orderByProperty)
                getKey(EntityTypes.customer, EntitySets.customers) ->
                    Repository(northwindEntities, EntityTypes.customer, EntitySets.customers, orderByProperty)
                getKey(EntityTypes.employee, EntitySets.employees) ->
                    Repository(northwindEntities, EntityTypes.employee, EntitySets.employees, orderByProperty)
                getKey(EntityTypes.invoice, EntitySets.invoices) ->
                    Repository(northwindEntities, EntityTypes.invoice, EntitySets.invoices, orderByProperty)
                getKey(EntityTypes.orderDetail, EntitySets.orderDetails) ->
                    Repository(northwindEntities, EntityTypes.orderDetail, EntitySets.orderDetails, orderByProperty)
                getKey(EntityTypes.orderDetailsExtended, EntitySets.orderDetailsExtendeds) ->
                    Repository(northwindEntities, EntityTypes.orderDetailsExtended, EntitySets.orderDetailsExtendeds, orderByProperty)
                getKey(EntityTypes.orderSubtotal, EntitySets.orderSubtotals) ->
                    Repository(northwindEntities, EntityTypes.orderSubtotal, EntitySets.orderSubtotals, orderByProperty)
                getKey(EntityTypes.order, EntitySets.orders) ->
                    Repository(northwindEntities, EntityTypes.order, EntitySets.orders, orderByProperty)
                getKey(EntityTypes.ordersQry, EntitySets.ordersQries) ->
                    Repository(northwindEntities, EntityTypes.ordersQry, EntitySets.ordersQries, orderByProperty)
                getKey(EntityTypes.productSalesFor1997, EntitySets.productSalesFor1997) ->
                    Repository(northwindEntities, EntityTypes.productSalesFor1997, EntitySets.productSalesFor1997, orderByProperty)
                getKey(EntityTypes.product, EntitySets.products) ->
                    Repository(northwindEntities, EntityTypes.product, EntitySets.products, orderByProperty)
                getKey(EntityTypes.productsAboveAveragePrice, EntitySets.productsAboveAveragePrices) ->
                    Repository(northwindEntities, EntityTypes.productsAboveAveragePrice, EntitySets.productsAboveAveragePrices, orderByProperty)
                getKey(EntityTypes.productsByCategory, EntitySets.productsByCategories) ->
                    Repository(northwindEntities, EntityTypes.productsByCategory, EntitySets.productsByCategories, orderByProperty)
                getKey(EntityTypes.region, EntitySets.regions) ->
                    Repository(northwindEntities, EntityTypes.region, EntitySets.regions, orderByProperty)
                getKey(EntityTypes.salesByCategory, EntitySets.salesByCategories) ->
                    Repository(northwindEntities, EntityTypes.salesByCategory, EntitySets.salesByCategories, orderByProperty)
                getKey(EntityTypes.salesTotalsByAmount, EntitySets.salesTotalsByAmounts) ->
                    Repository(northwindEntities, EntityTypes.salesTotalsByAmount, EntitySets.salesTotalsByAmounts, orderByProperty)
                getKey(EntityTypes.shipper, EntitySets.shippers) ->
                    Repository(northwindEntities, EntityTypes.shipper, EntitySets.shippers, orderByProperty)
                getKey(EntityTypes.summaryOfSalesByQuarter, EntitySets.summaryOfSalesByQuarters) ->
                    Repository(northwindEntities, EntityTypes.summaryOfSalesByQuarter, EntitySets.summaryOfSalesByQuarters, orderByProperty)
                getKey(EntityTypes.summaryOfSalesByYear, EntitySets.summaryOfSalesByYears) ->
                    Repository(northwindEntities, EntityTypes.summaryOfSalesByYear, EntitySets.summaryOfSalesByYears, orderByProperty)
                getKey(EntityTypes.supplier, EntitySets.suppliers) ->
                    Repository(northwindEntities, EntityTypes.supplier, EntitySets.suppliers, orderByProperty)
                getKey(EntityTypes.territory, EntitySets.territories) ->
                    Repository(northwindEntities, EntityTypes.territory, EntitySets.territories, orderByProperty)
                else -> throw AssertionError("Fatal error, entity set[$key] missing in generated code")
            }
            repositories[key] = repository
        }
        return repository
    }

    /**
     * Get rid of all cached repositories
     */
    fun reset() {
        repositories.clear()
    }
}
