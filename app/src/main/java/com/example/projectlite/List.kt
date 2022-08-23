package com.example.projectlite

val list = listOf(
    OuterModel(
        "Today",
        listOf(
            OuterModel.InnerModel("Grocery", R.drawable.ic_baseline_incomplete_circle_24, 200.0),
            OuterModel.InnerModel("Grocery", R.drawable.ic_baseline_incomplete_circle_24, 200.0),
            OuterModel.InnerModel("Grocery", R.drawable.ic_baseline_incomplete_circle_24, 200.0)
        )
    ),
    OuterModel(
        "Yesterday",
        listOf(
            OuterModel.InnerModel("Grocery", R.drawable.ic_baseline_incomplete_circle_24, -200.0),
            OuterModel.InnerModel("Grocery", R.drawable.ic_baseline_incomplete_circle_24, 200.0),
            OuterModel.InnerModel("Grocery", R.drawable.ic_baseline_incomplete_circle_24, 200.0)
        )
    ),
    OuterModel(
        "12.3.2022",
        listOf(
            OuterModel.InnerModel("Grocery", R.drawable.ic_baseline_incomplete_circle_24, 200.0),
            OuterModel.InnerModel("Grocery", R.drawable.ic_baseline_incomplete_circle_24, -200.0),
            OuterModel.InnerModel("Grocery", R.drawable.ic_baseline_incomplete_circle_24, -200.0)
        )
    ),
    OuterModel(
        "12.3.2022",
        listOf(
            OuterModel.InnerModel("Grocery", R.drawable.ic_baseline_incomplete_circle_24, 200.0),
            OuterModel.InnerModel("Grocery", R.drawable.ic_baseline_incomplete_circle_24, -200.0),
            OuterModel.InnerModel("Grocery", R.drawable.ic_baseline_incomplete_circle_24, -200.0)
        )
    )
)