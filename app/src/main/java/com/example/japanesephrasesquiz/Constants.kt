package com.example.japanesephrasesquiz

object Constants {

    fun getQuestions():ArrayList<Question>{
        val questionList = ArrayList<Question>()

        // Question 1
        val ques1 = Question(1,"What does this Japanese Phrase mean?", R.drawable.ic_jpphrases,
            "Thank you", "Goodbye", "Sorry", "Excuse me", 1 )
        questionList.add(ques1)

        // Question 2
        val ques2 = Question(2,"What does this Japanese Phrase mean?", R.drawable.ic_jpphrases,
            "Thank you", "Goodbye", "Sorry", "Excuse me", 2 )
        questionList.add(ques2)

        // Question 3
        val ques3 = Question(3,"What does this Japanese Phrase mean?", R.drawable.ic_jpphrases,
            "Thank you", "Goodbye", "Sorry", "Excuse me", 2 )
        questionList.add(ques3)

        // Question 4
        val ques4 = Question(4,"What does this Japanese Phrase mean?", R.drawable.ic_jpphrases,
            "Thank you", "Goodbye", "Sorry", "Excuse me", 2 )
        questionList.add(ques4)

        // Question 5
        val ques5 = Question(5,"What does this Japanese Phrase mean?", R.drawable.ic_jpphrases,
            "Thank you", "Goodbye", "Sorry", "Excuse me", 2 )
        questionList.add(ques5)

        // Question 6
        val ques6 = Question(6,"What does this Japanese Phrase mean?", R.drawable.ic_jpphrases,
            "Thank you", "Goodbye", "Sorry", "Excuse me", 2 )
        questionList.add(ques6)

        // Question 7
        val ques7 = Question(7,"What does this Japanese Phrase mean?", R.drawable.ic_jpphrases,
            "Thank you", "Goodbye", "Sorry", "Excuse me", 2 )
        questionList.add(ques7)

        // Question 8
        val ques8 = Question(8,"What does this Japanese Phrase mean?", R.drawable.ic_jpphrases,
            "Thank you", "Goodbye", "Sorry", "Excuse me", 2 )
        questionList.add(ques8)

        // Question 9
        val ques9 = Question(9,"What does this Japanese Phrase mean?", R.drawable.ic_jpphrases,
            "Thank you", "Goodbye", "Sorry", "Excuse me", 2 )
        questionList.add(ques9)

        // Question 10
        val ques10 = Question(10,"What does this Japanese Phrase mean?", R.drawable.ic_jpphrases,
            "Thank you", "Goodbye", "Sorry", "Excuse me", 2 )
        questionList.add(ques10)

        return questionList
    }
}