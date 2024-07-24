package com.rovaniemii.bluu

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.rovaniemii.bluu.ui.NotePreviewView
import com.rovaniemii.data.NotePreviewData
import com.rovaniemii.designsystem.VerticalGridView

@Composable
fun MainScreen(
    modifier: Modifier = Modifier,
    notePreviews: List<NotePreviewData>? = null,
) {
    notePreviews?.let {
        VerticalGridView(
            modifier = modifier,
            cellsSize = 2,
            items = notePreviews,
        ) { item, index ->
            NotePreviewView(
                modifier = Modifier
                    .padding(
                        vertical = 6.dp,
                        horizontal = 8.dp,
                    ),
                title = item.title,
                date = item.date,
                image = item.url,
            )

            if (notePreviews.lastIndex > index) {
                Spacer(modifier = Modifier.height(6.dp))
            }
        }
    }
}


@Preview
@Composable
private fun PreviewMainScreen() {
    Surface {
        MainScreen(
            notePreviews = listOf(
                NotePreviewData(
                    title = "제목 입니다 1",
                    date = "2024-7-24",
                    url = "",
                ),
                NotePreviewData(
                    title = "제목 입니다 2",
                    date = "2024-7-24",
                    url = "",
                ),
                NotePreviewData(
                    title = "제목 입니다 3",
                    date = "2024-7-24",
                    url = "",
                ),
                NotePreviewData(
                    title = "제목 입니다 4",
                    date = "2024-7-24",
                    url = "",
                ),
                NotePreviewData(
                    title = "제목 입니다 5",
                    date = "2024-7-24",
                    url = "",
                ),
                NotePreviewData(
                    title = "제목 입니다 6",
                    date = "2024-7-24",
                    url = "",
                ),
            )
        )
    }
}