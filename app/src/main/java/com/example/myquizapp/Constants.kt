package com.example.myquizapp

object Constants {
    const val USER_NAME : String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS:String = "correct_answers"

    fun getQuestions(): ArrayList<Question> {
        val questionList = ArrayList<Question>()
        val que1 = Question(
            1, "What country does this flag belong to?",
            R.drawable.ic_flag_of_argentina,
            "Argentina", "Australia",
            "Armenia", "Austria",
            1
        )
        questionList.add(que1)
        //2
        val que2 = Question(
            2, "What country does this flag belong to?",
            R.drawable.ic_flag_of_australia,
            "Africa", "Australia",
            "America", "Austria",
            2
        )
        questionList.add(que2)

        //3
        val que3 = Question(
            3, "What country does this flag belong to?",
            R.drawable.ic_flag_of_belgium,
            "India", "Pakistan",
            "Japan", "Belgium",
            4
        )
        questionList.add(que3)

        //4
        val que4 = Question(
            4, "What country does this flag belong to?",
            R.drawable.ic_flag_of_brazil,
            "Brazil", "New Zealand",
            "Australia", "Africa",
            1
        )
        questionList.add(que4)

        //5
        val que5 = Question(
            5, "What country does this flag belong to?",
            R.drawable.ic_flag_of_denmark,
            "Afghanistan", "Denmark",
            "India", "Africa",
            2
        )
        questionList.add(que5)

        //6
        val que6 = Question(
            6, "What country does this flag belong to?",
            R.drawable.ic_flag_of_fiji,
            "Fiji", "India",
            "Bangladesh", "Sri Lanka",
            1
        )
        questionList.add(que6)

        //7
        val que7 = Question(
            7, "What country does this flag belong to?",
            R.drawable.ic_flag_of_germany,
            "Bangladesh", "South Korea",
            "Kuwait", "Germany",
            4
        )
        questionList.add(que7)

        //8
        val que8 = Question(
            8, "What country does this flag belong to?",
            R.drawable.ic_flag_of_india,
            "India", "America",
            "Argentina", "Pakistan",
            1
        )
        questionList.add(que8)

        //9
        val que9 = Question(
            9, "What country does this flag belong to?",
            R.drawable.ic_flag_of_kuwait,
            "India", "Austria",
            "Kuwait", "Australia",
            3
        )
        questionList.add(que9)
        return questionList

    }
}
