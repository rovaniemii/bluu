package com.rovaniemii.bluu

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.rovaniemii.bluu.ui.NotePreviewView
import com.rovaniemii.data.NotePreviewData

@Composable
fun MainScreen(
    modifier: Modifier = Modifier,
    notePreviews: List<NotePreviewData>? = null,
) {
    Column(
        modifier = modifier
            .padding(
                horizontal = 8.dp,
                vertical = 10.dp,
            )
            .verticalScroll(rememberScrollState()),
    ) {
        notePreviews?.forEachIndexed { index, notePreviewData ->
            NotePreviewView(
                title = notePreviewData.title,
                date = notePreviewData.date,
                image = notePreviewData.url,
            )

            if (notePreviews.lastIndex > index) {
                Spacer(modifier = Modifier.height(6.dp))
            }
        }
    }
}

@Preview
@Composable
private fun PreviewMainScreen(){
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