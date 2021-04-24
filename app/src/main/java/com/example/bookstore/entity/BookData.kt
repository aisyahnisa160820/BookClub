package com.example.bookstore.entity

import com.example.bookstore.R

object BookData {
    val listGambar = intArrayOf(R.drawable.annakarenina,
                                R.drawable.dracula,
                                R.drawable.dune,
                                R.drawable.howtokillamockingbird,
                                R.drawable.hungergames,
                                R.drawable.lesmiserables,
                                R.drawable.prideandprejudice,
                                R.drawable.thealchemist,
                                R.drawable.thebookthief,
                                R.drawable.theodyssey,
                                R.drawable.thelittleprince,
                                R.drawable.thememoarofgeisha)

    val listName = arrayOf( "Anna Karenina",
                            "Dracula",
                            "Dune",
                            "How To Kill A Mokingbird",
                            "Hunger Games",
                            "Les Miserables",
                            "Pride and Prejudice",
                            "The Alchemist",
                            "The Book Thief",
                            "The Odyssey",
                            "The Little Price",
                            "The Memoirs of Geisha"
    )
    val infoDate = arrayOf("Anna Karenina provides a vast panorama of contemporary life in Russia and of humanity in general. In it Tolstoy uses his intense imaginative insight to create some of the most memorable characters in all of literature. Anna is a sophisticated woman who abandons her empty existence as the wife of Karenin and turns to Count Vronsky to fulfil her passionate nature - with tragic consequences.",
                           "A rich selection of background and source materials is provided in three areas: Contexts includes probable inspirations for Dracula in the earlier works of James Malcolm Rymer and Emily Gerard. Also included are a discussion of Stoker's working notes for the novel and \"Dracula's Guest,\" the original opening chapter to Dracula. ",
                           "When House Atreides is betrayed, the destruction of Paul’s family will set the boy on a journey toward a destiny greater than he could ever have imagined. And as he evolves into the mysterious man known as Muad’Dib, he will bring to fruition humankind’s most ancient and unattainable dream",
                           "It went on to win the Pulitzer Prize in 1961 and was later made into an Academy Award-winning film, also a classic.\n" + "\n" + "Compassionate, dramatic, and deeply moving, \"To Kill A Mockingbird\" takes readers to the roots of human behavior - to innocence and experience, kindness and cruelty, love and hatred, humor and pathos.",
                           "In the ruins of a place once known as North America lies the nation of Panem, a shining Capitol surrounded by twelve outlying districts. The Capitol is harsh and cruel and keeps the districts in line by forcing them all to send one boy and one girl between the ages of twelve and eighteen to participate in the annual Hunger Games, a fight to the death on live TV.\n",
                           "Jean Valjean, an escaped convict determined to put his criminal past behind him. But his attempts to become a respected member of the community are constantly put under threat: by his own conscience, when, owing to a case of mistaken identity, another man is arrested in his place; and by the relentless investigations of the dogged Inspector Javert.",
                           "Jane Austen called this brilliant work \"her own darling child\" and its vivacious heroine, Elizabeth Bennet,The romantic clash between the opinionated Elizabeth and her proud beau, Mr. Darcy, is a splendid performance of civilized sparring. And Jane Austen's radiant wit sparkles as her characters dance a delicate quadrille of flirtation and intrigue, making this book the most superb comedy of manners of Regency England",
                           "This story, dazzling in its powerful simplicity and soul-stirring wisdom, is about an Andalusian shepherd boy named Santiago who travels from his homeland in Spain to the Egyptian desert in search of a treasure buried near the Pyramids. Along the way he meets a Gypsy woman, a man who calls himself king, and an alchemist, all of whom point Santiago in the direction of his quest. ",
                           "It is 1939. Nazi Germany. The country is holding its breath. Death has never been busier, and will be busier still.\n"+ "By her brother's graveside, Liesel's life is changed when she picks up a single object, partially hidden in the snow. It is The Gravedigger's Handbook, left behind there by accident, and it is her first act of book thievery. So begins a love affair with books and words that might bring her, death.",
                           "If the Iliad is the world's greatest war epic, then the Odyssey is literature's grandest evocation of everyman's journey though life. Odysseus' reliance on his wit and wiliness for survival in his encounters with divine and natural forces, during his ten-year voyage home to Ithaca after the Trojan War, is at once a timeless human story and an individual test of moral endurance.",
                           "Richard Howard's translation of the beloved classic beautifully reflects Saint-Exupéry's unique and gifted style. Howard, an acclaimed poet and one of the preeminent translators of our time, has excelled in bringing the English text as close as possible to the French, in language, style, and most important, spirit. The artwork in this edition has been restored to match in detail and in color Saint-Exupéry's original artwork.",
                           "In Memoirs of a Geisha, we enter a world where appearances are paramount; where a girl's virginity is auctioned to the highest bidder; where women are trained to beguile the most powerful men; and where love is scorned as illusion. It is a unique and triumphant work of fiction - at once romantic, erotic, suspenseful - and completely unforgettable."
    )


    val listBook: ArrayList<Book>
        get() {
            val list = ArrayList<Book>()
            for (i in listName.indices){
                val book = Book()
                book.nameBook = listName[i]
                book.imgBook = listGambar[i]
                book.describeBook = infoDate[i]
                list.add(book)
            }
            return list
        }
}

