package com.example.myapplicationnew.presentation.MainScreen.models

import com.example.myapplicationnew.domain.models.CategoryProduct

sealed class CategoryLoadState {

    object Loading : CategoryLoadState()

    data class Loaded(val categoryList: List<CategoryProduct>,val selected:String) : CategoryLoadState()

    object Error : CategoryLoadState()
}
