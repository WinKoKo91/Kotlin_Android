package com.example.dell.myapplication

class DataManager {

    val courses = HashMap<String, CourseInfo>()
    val notes = ArrayList<NoteInfo>()

    init {
        initializeCourses()
    }

    private fun initializeCourses() {
        var course = CourseInfo("android_intents", "Android Programming with Intents")
        courses.set(course.courseId, course)

        course = CourseInfo(courseId = "android_async", title = "Android Async Programing and Service")
        courses.set(course.courseId, course)

        course = CourseInfo(title = "Java Fundamentals: Java Language", courseId = "java_lang")
        courses.set(course.courseId, course)

        course = CourseInfo("android_core", "Java Fundatmentals: The core platform")
        courses.set(course.courseId, course)
    }
}