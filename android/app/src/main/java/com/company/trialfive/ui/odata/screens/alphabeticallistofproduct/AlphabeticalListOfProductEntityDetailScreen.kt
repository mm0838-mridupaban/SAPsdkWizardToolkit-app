package com.company.trialfive.ui.odata.screens.alphabeticallistofproduct

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.company.trialfive.R
import com.company.trialfive.ui.odata.*
import com.company.trialfive.ui.odata.screens.*
import com.company.trialfive.service.SAPServiceManager
import com.company.trialfive.ui.odata.data.EntityMediaResource
import com.company.trialfive.ui.odata.viewmodel.ODataViewModel
import com.sap.cloud.mobile.fiori.compose.keyvaluecell.model.FioriKeyValueCellContent
import com.sap.cloud.mobile.fiori.compose.keyvaluecell.ui.FioriKeyValueCell
import com.sap.cloud.mobile.fiori.compose.objectheader.model.*
import com.sap.cloud.mobile.fiori.compose.objectheader.ui.FioriObjectHeader
import com.sap.cloud.mobile.kotlin.odata.EntityValue
import com.sap.cloud.mobile.kotlin.odata.NavigationProperty
import com.company.trialfive.ui.odata.screens.OperationScreen
import com.company.trialfive.ui.odata.screens.OperationScreenSettings
import com.company.trialfive.ui.odata.screens.defaultObjectHeaderData
import com.sap.cloud.mobile.fiori.compose.theme.fioriHorizonAttributes
import com.sap.cloud.android.odata.northwindentities.AlphabeticalListOfProduct

val AlphabeticalListOfProductEntityDetailScreen: @Composable (
    onNavigateProperty: (EntityValue, NavigationProperty) -> Unit,
    navigateUp: (() -> Unit)?,
    viewModel: ODataViewModel,
    isExpandedScreen: Boolean
) -> Unit = { _, navigateUp, viewModel, isExpandedScreen ->
    val uiState by viewModel.odataUIState.collectAsState()

    val deleteConfirm = remember {
        mutableStateOf(false)
    }

    DeleteEntityWithConfirmation(viewModel, deleteConfirm)

    OperationScreen(
        screenSettings = OperationScreenSettings(
            title = screenTitle(getEntityScreenInfo(viewModel.entityType, viewModel.entitySet), ScreenType.Details),
            actionItems = listOf(
                ActionItem(
                    nameRes = R.string.menu_update,
                    iconRes = R.drawable.ic_sap_icon_edit,
                    overflowMode = OverflowMode.IF_NECESSARY,
                    doAction = viewModel::onEditAction
                ),
                ActionItem(
                    nameRes = R.string.menu_delete,
                    iconRes = R.drawable.ic_sap_icon_delete,
                    overflowMode = OverflowMode.IF_NECESSARY,
                    doAction = { deleteConfirm.value = true }
                ),
            ),
            navigateUp = if (isExpandedScreen) null else navigateUp,
        ),
        modifier = Modifier,
        viewModel = viewModel
    ) {
        Column {
            val entity = uiState.masterEntity
            if (entity != null) {
                FioriObjectHeader(
                    modifier = Modifier.fillMaxWidth(),
                    primaryPage = defaultObjectHeaderData(
                        title = viewModel.getEntityTitle(entity),
                        imageUrl = EntityMediaResource.getMediaResourceUrl(
                            entity,
                            SAPServiceManager.serviceRoot
                        ),
                        imageChars = viewModel.getAvatarText(entity)
                    ),
                    statusLayout = FioriObjectHeaderStatusLayout.Inline
                )

                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(start = 12.dp, end = 12.dp)
                        .verticalScroll(rememberScrollState())
                ) {
                    FioriKeyValueCell(
                        content = FioriKeyValueCellContent(
                                key = AlphabeticalListOfProduct.categoryName.name,
                                value = entity.getOptionalValue(AlphabeticalListOfProduct.categoryName)?.toString() ?: ""
                            )
                        )
                    FioriKeyValueCell(
                        content = FioriKeyValueCellContent(
                                key = AlphabeticalListOfProduct.discontinued.name,
                                value = entity.getOptionalValue(AlphabeticalListOfProduct.discontinued)?.toString() ?: ""
                            )
                        )
                    FioriKeyValueCell(
                        content = FioriKeyValueCellContent(
                                key = AlphabeticalListOfProduct.productID.name,
                                value = entity.getOptionalValue(AlphabeticalListOfProduct.productID)?.toString() ?: ""
                            )
                        )
                    FioriKeyValueCell(
                        content = FioriKeyValueCellContent(
                                key = AlphabeticalListOfProduct.productName.name,
                                value = entity.getOptionalValue(AlphabeticalListOfProduct.productName)?.toString() ?: ""
                            )
                        )
                    FioriKeyValueCell(
                        content = FioriKeyValueCellContent(
                                key = AlphabeticalListOfProduct.supplierID.name,
                                value = entity.getOptionalValue(AlphabeticalListOfProduct.supplierID)?.toString() ?: ""
                            )
                        )
                    FioriKeyValueCell(
                        content = FioriKeyValueCellContent(
                                key = AlphabeticalListOfProduct.categoryID.name,
                                value = entity.getOptionalValue(AlphabeticalListOfProduct.categoryID)?.toString() ?: ""
                            )
                        )
                    FioriKeyValueCell(
                        content = FioriKeyValueCellContent(
                                key = AlphabeticalListOfProduct.quantityPerUnit.name,
                                value = entity.getOptionalValue(AlphabeticalListOfProduct.quantityPerUnit)?.toString() ?: ""
                            )
                        )
                    FioriKeyValueCell(
                        content = FioriKeyValueCellContent(
                                key = AlphabeticalListOfProduct.unitPrice.name,
                                value = entity.getOptionalValue(AlphabeticalListOfProduct.unitPrice)?.toString() ?: ""
                            )
                        )
                    FioriKeyValueCell(
                        content = FioriKeyValueCellContent(
                                key = AlphabeticalListOfProduct.unitsInStock.name,
                                value = entity.getOptionalValue(AlphabeticalListOfProduct.unitsInStock)?.toString() ?: ""
                            )
                        )
                    FioriKeyValueCell(
                        content = FioriKeyValueCellContent(
                                key = AlphabeticalListOfProduct.unitsOnOrder.name,
                                value = entity.getOptionalValue(AlphabeticalListOfProduct.unitsOnOrder)?.toString() ?: ""
                            )
                        )
                    FioriKeyValueCell(
                        content = FioriKeyValueCellContent(
                                key = AlphabeticalListOfProduct.reorderLevel.name,
                                value = entity.getOptionalValue(AlphabeticalListOfProduct.reorderLevel)?.toString() ?: ""
                            )
                        )
                }
            }
        }
    }
}

