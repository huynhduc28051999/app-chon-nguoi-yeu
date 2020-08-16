package com.example.appchonnguoiyeu

class Person {
    private var name: String? = null
    private var age: Int? = null
    constructor(name: String?, age: Int?) {
        this.name = name
        this.age = age
    }
    fun getName(): String? {
        return this.name
    }
    fun getAge(): Int? {
        return this.age
    }
    fun setName(name: String?) {
        this.name = name
    }
    fun setAge(age: Int?) {
        this.age = age
    }
}