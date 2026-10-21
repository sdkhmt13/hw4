package mooc.vandy.java4android.artspace

import androidx.annotation.DrawableRes

data class Artwork(
    @DrawableRes val imageRes: Int,
    val title: String,
    val artist: String,
    val year: String
)

val artworks = listOf(
    Artwork(
        imageRes = R.drawable.fale_london_79,
        title = "Fale, London",
        artist = "Unknown Artist",
        year = "2023"
    ),
    Artwork(
        imageRes = R.drawable.inside_the_hermitage,
        title = "Inside the Hermitage",
        artist = "Unknown Artist",
        year = "2023"
    ),
    Artwork(
        imageRes = R.drawable.national_palace_museum,
        title = "National Palace Museum",
        artist = "Unknown Artist",
        year = "2023"
    )
)