package com.ashwin.android.observalefield

import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test

class MainViewModelTest {
    lateinit var mainViewModel: MainViewModel

    @Before
    fun setup() {
        mainViewModel = MainViewModel()
    }

    @Test
    fun testUpdateUser() {
        // Trigger
        val user = User()
        user.name = "John Doe"
        user.email = "john.doe@email.com"
        mainViewModel.updateUser(user)

        // Validate
        assertEquals(user, mainViewModel.userField.get())
    }

    @Test
    fun testupdateBoolean() {
        // Trigger
        val b = true
        mainViewModel.updateBoolean(b)

        // Validate
        assertEquals(b, mainViewModel.boolField.get())
    }
}