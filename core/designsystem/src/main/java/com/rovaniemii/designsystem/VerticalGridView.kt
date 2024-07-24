package com.rovaniemii.designsystem

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyGridItemScope
import androidx.compose.foundation.lazy.grid.LazyGridState
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.rememberLazyGridState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun <T> VerticalGridView(
    modifier: Modifier = Modifier,
    cellsSize: Int = 2,
    items: List<T>,
    state: LazyGridState = rememberLazyGridState(),
    content: @Composable LazyGridItemScope.(item: T, index: Int) -> Unit,
) {
    LazyVerticalGrid(
        modifier = modifier
            .fillMaxSize()
            .background(
                color = White,
            ),
        columns = GridCells.Fixed(cellsSize),
        state = state,
    ) {
        items(
            count = items.size,
            key = { index ->
                items[index].hashCode() + index
            },
        ) { index ->
            content(items[index], index)
        }
    }
}