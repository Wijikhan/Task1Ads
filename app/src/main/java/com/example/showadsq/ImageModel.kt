package com.example.showadsq

data class ImageModel(val image: Int, val description: String)

object MockList {

    fun getImageModel(): List<ImageModel> {


        val itemImageModel1 = ImageModel(
            R.drawable.image,
            "Lord Of The Rings",
        )

        val itemImageModel2 = ImageModel(
            R.drawable.image,
            "Harry Potter",
        )


        val itemImageModel3 = ImageModel(
            R.drawable.image,
            "Interstellar",
        )


        val itemImageModel4 = ImageModel(
            R.drawable.image,
            "Squid Game",
        )


        val itemImageModel5 = ImageModel(
            R.drawable.image,
            "How I Met Your Mother",
        )


        val itemImageModel6 = ImageModel(
            R.drawable.image,
            "Vikings",
        )

        val itemImageModel7 = ImageModel(
            R.drawable.image,
            "The Walking Dead",
        )

        val itemImageModel8 = ImageModel(
            R.drawable.image,
            "Spartacus",
        )
        val itemImageModel9 = ImageModel(
            R.drawable.image,
            "Rick and Morty",
        )
        val itemImageModel10 = ImageModel(
            R.drawable.image,
            "Hababam Sınıfı",
        )


        val itemList: ArrayList<ImageModel> = ArrayList()
        itemList.add(itemImageModel1)
        itemList.add(itemImageModel2)
        itemList.add(itemImageModel3)
        itemList.add(itemImageModel4)
        itemList.add(itemImageModel5)
        itemList.add(itemImageModel6)
        itemList.add(itemImageModel7)
        itemList.add(itemImageModel8)
        itemList.add(itemImageModel9)
        itemList.add(itemImageModel10)



        return itemList
    }

}