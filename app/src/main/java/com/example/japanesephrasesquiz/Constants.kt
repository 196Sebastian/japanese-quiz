package com.example.japanesephrasesquiz

import android.widget.EditText
import android.widget.TextView
import org.w3c.dom.Text

object Constants {

    const val USER_NAME : String = "user name"
    const val TOTAL_QUESTIONS : String = "total questions"
    const val CORRECT_ANSWERS : String = "correct answers"

    fun getQuestions():ArrayList<Question>{
        val questionList = ArrayList<Question>()

        // Question 1
        val ques1 = Question(1,"What does this Japanese Phrase mean?", R.drawable.ic_delicious,
            "It's delicious", "Disgusting", "It's okay", "No thank you", 1 )
        questionList.add(ques1)

        // Question 2
        val ques2 = Question(2,"What does this Japanese Phrase mean?", R.drawable.ic_do_not_understand,
            "I understand", "Agree", "Sorry", "I don't understand", 4 )
        questionList.add(ques2)

        // Question 3
        val ques3 = Question(3,"What does this Japanese Phrase mean?", R.drawable.ic_excuse_me,
            "Goodbye", "Excuse me", "Sorry", "Move", 2 )
        questionList.add(ques3)

        // Question 4
        val ques4 = Question(4,"What does this Japanese Phrase mean?", R.drawable.ic_goodbye,
            "Hi", "Goodbye", "Sorry", "Hello", 2 )
        questionList.add(ques4)

        // Question 5
        val ques5 = Question(5,"What does this Japanese Phrase mean?", R.drawable.ic_how_much,
            "How much is it", "That's cheap", "No thank you", "Too expensive", 1 )
        questionList.add(ques5)

        // Question 6
        val ques6 = Question(6,"What does this Japanese Phrase mean?", R.drawable.ic_hello,
            "Thank you", "Till next time", "Hello", "See you later", 3 )
        questionList.add(ques6)

        // Question 7
        val ques7 = Question(7,"What does this Japanese Phrase mean?", R.drawable.ic_sorry,
            "Rude", "No thanks", "Sorry", "Happy", 3 )
        questionList.add(ques7)

        // Question 8
        val ques8 = Question(8,"What does this Japanese Phrase mean?", R.drawable.ic_how_are_you,
            "How are you", "How was it", "How'd it go", "None of the above", 1 )
        questionList.add(ques8)

        // Question 9
        val ques9 = Question(9,"What does this Japanese Phrase mean?", R.drawable.ic_love_you,
            "Go away", "I hate you", "I can't stand you", "I love you", 4 )
        questionList.add(ques9)

        // Question 10
        val ques10 = Question(10,"What does this Japanese Phrase mean?", R.drawable.ic_thankyou,
            "Thank you", "Wish you the best", "Good night", "Good morning", 1 )
        questionList.add(ques10)

        return questionList
    }
}