package com.example.courses.data

import androidx.compose.ui.res.stringResource
import com.example.courses.R
import com.example.courses.model.Topic

object DataSource {
    val topics=listOf(
        Topic(nameResource =  R.string.architecture, topicsCount =  58,imageResource= R.drawable.architecture),
        Topic(nameResource =R.string.automotive,topicsCount = 30,imageResource= R.drawable.automotive),
        Topic(nameResource =R.string.biology,topicsCount = 90,imageResource= R.drawable.biology),
        Topic(nameResource =R.string.crafts,topicsCount = 121,imageResource= R.drawable.crafts),
        Topic(nameResource =R.string.business,topicsCount = 78,imageResource= R.drawable.business),
        Topic(nameResource =R.string.culinary,topicsCount = 118,imageResource= R.drawable.culinary),
        Topic(nameResource =R.string.design,topicsCount = 423,imageResource= R.drawable.design),
        Topic(nameResource =R.string.ecology,topicsCount = 28,imageResource= R.drawable.ecology),
        Topic(nameResource =R.string.engineering,topicsCount = 67,imageResource= R.drawable.engineering),
        Topic(nameResource =R.string.fashion,topicsCount = 92,imageResource= R.drawable.fashion),
        Topic(nameResource =R.string.finance,topicsCount = 100,imageResource= R.drawable.finance),
        Topic(nameResource =R.string.film,topicsCount = 165,imageResource= R.drawable.film),
        Topic(nameResource =R.string.gaming,topicsCount = 37,imageResource= R.drawable.gaming),
        Topic(nameResource =R.string.geology,topicsCount = 290,imageResource= R.drawable.geology),
        Topic(nameResource =R.string.drawing,topicsCount = 326,imageResource= R.drawable.drawing),
        Topic(nameResource =R.string.history,topicsCount = 189,imageResource= R.drawable.history),
        Topic(nameResource =R.string.journalism,topicsCount = 96,imageResource= R.drawable.journalism),
        Topic(nameResource =R.string.law,topicsCount = 58,imageResource= R.drawable.law),
        Topic(nameResource =R.string.lifestyle,topicsCount = 305,imageResource= R.drawable.lifestyle),
        Topic(nameResource =R.string.music,topicsCount = 212,imageResource= R.drawable.music),
        Topic(nameResource =R.string.painting,topicsCount = 172,imageResource= R.drawable.painting),
        Topic(nameResource =R.string.photography,topicsCount = 321,imageResource= R.drawable.photography),
        Topic(nameResource =R.string.physics,topicsCount = 41,imageResource= R.drawable.physics),
        Topic(nameResource =R.string.tech,topicsCount = 118,imageResource= R.drawable.tech),
    )
}