package com.company.trialfive.ui.odata.screens.employee

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import com.company.trialfive.ui.odata.ScreenType
import com.company.trialfive.ui.odata.getEntityScreenInfo
import com.company.trialfive.ui.odata.screenTitle
import com.company.trialfive.ui.odata.screens.DeleteEntityWithConfirmation
import com.company.trialfive.ui.odata.screens.OperationScreen
import com.company.trialfive.ui.odata.screens.OperationScreenSettings
import com.company.trialfive.ui.odata.screens.getSelectedItemActionsList
import com.company.trialfive.ui.odata.viewmodel.EntityOperationType
import com.company.trialfive.ui.odata.viewmodel.EntityUpdateOperationType
import com.company.trialfive.ui.odata.viewmodel.ODataViewModel
import com.sap.cloud.mobile.kotlin.odata.EntityValue
import com.sap.cloud.mobile.kotlin.odata.NavigationProperty

val EmployeeEntitiesExpandScreen:
        @Composable (
            navigateToHome: () -> Unit,
            navigateUp: () -> Unit,
            onNavigateProperty: (EntityValue, NavigationProperty) -> Unit,
            viewModel: ODataViewModel,
        ) -> Unit =
    { navigateToHome, navigateUp, onNavigateProperty, viewModel ->
        val uiState by viewModel.odataUIState.collectAsState()
        Row(modifier = Modifier) {
            Box(modifier = Modifier.weight(1f)) {
                EmployeeEntitiesScreen(
                    navigateToHome,
                    navigateUp,
                    viewModel,
                    true
                )
            }
            Box(modifier = Modifier.weight(2f)) {
                when (uiState.entityOperationType) {
                    EntityOperationType.DETAIL -> {
                        EmployeeEntityDetailScreen(onNavigateProperty, null, viewModel, true)
                    }

                    EntityOperationType.CREATE, EntityUpdateOperationType.UPDATE_FROM_LIST, EntityUpdateOperationType.UPDATE_FROM_DETAIL -> {
                        EmployeeEntityEditScreen(null, viewModel, true)
                    }

                    else -> {
                        EmployeeBlankScreen(viewModel)
                    }
                }
            }
        }
    }

val EmployeeBlankScreen:
        @Composable (
            viewModel: ODataViewModel,
        ) -> Unit =
    { viewModel ->
    val deleteState = remember {
        mutableStateOf(false)
    }
    OperationScreen(
        screenSettings = OperationScreenSettings(
            title = screenTitle(
                getEntityScreenInfo(viewModel.entityType, viewModel.entitySet),
                ScreenType.Details
            ),
            actionItems = getSelectedItemActionsList(
                viewModel,
                deleteState
            ),
            navigateUp = null,
        ),
        modifier = Modifier,
        viewModel = viewModel
    ) {
        Box(modifier = Modifier)
        DeleteEntityWithConfirmation(viewModel, deleteState)
    }
}
