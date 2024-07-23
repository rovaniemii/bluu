package com.rovaniemii.bluu.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.rovaniemii.bluu.R
import com.rovaniemii.designsystem.BodyLite
import com.rovaniemii.designsystem.GrayBolder
import com.rovaniemii.designsystem.GrayText
import com.rovaniemii.designsystem.ImageBackground
import com.rovaniemii.designsystem.PreviewTitle
import com.rovaniemii.designsystem.White

@Composable
fun NotePreviewView(
    modifier: Modifier = Modifier,
    title: String,
    date: String,
    image: String,
) {
    Column(
        modifier = modifier
            .background(
                shape = RoundedCornerShape(16.dp),
                color = White,
            )
            .border(
                width = 1.dp,
                color = GrayBolder,
                shape = RoundedCornerShape(16.dp),
            )
            .padding(
                vertical = 10.dp,
                horizontal = 12.dp,
            )
    ) {
        AsyncImage(
            modifier = modifier
                .background(
                    shape = RoundedCornerShape(16.dp),
                    color = ImageBackground,
                )
                .border(
                    width = 1.dp,
                    color = Color.White,
                    shape = RoundedCornerShape(16.dp),
                )
                .aspectRatio(1.5f),
            model = ImageRequest.Builder(LocalContext.current)
                .data(image)
                .crossfade(true)
                .apply {
                    error(R.drawable.ic_launcher_background)
                }
                .build(),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            alignment = Alignment.Center,
        )

        Column(
            modifier = Modifier
                .padding(
                    horizontal = 8.dp,
                )
        ) {
            Spacer(modifier = Modifier.height(10.dp))

            Text(
                text = title,
                style = PreviewTitle,
                color = GrayText,
            )

            Spacer(modifier = Modifier.height(6.dp))

            Row {
                Text(
                    text = date,
                    style = BodyLite,
                    color = GrayText,
                )

                Spacer(modifier = Modifier.weight(1f))
            }
        }
    }
}

@Preview
@Composable
private fun PreviewNotesPreviewView(){
    Surface {
        NotePreviewView(
            title = "어쩌구 저쩌구",
            date = "2024-13-31",
            image = "",
        )
    }
}