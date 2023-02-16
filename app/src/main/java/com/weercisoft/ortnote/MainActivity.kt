package com.weercisoft.ortnote

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.weercisoft.ortnote.routine.Screen
import com.weercisoft.ortnote.ui.components.AppDrawer
import com.weercisoft.ortnote.ui.components.Note
import com.weercisoft.ortnote.ui.screens.NotesScreen
import com.weercisoft.ortnote.ui.theme.OrtNoteTheme
import com.weercisoft.ortnote.viewModel.MainViewModel
import com.weercisoft.ortnote.viewModel.MainViewModelFactory
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {

    private val viewModel: MainViewModel by viewModels {
        MainViewModelFactory(
            this,
            (application as App).dependencyInjector.repository
        )
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            OrtNoteTheme {
                NotesScreen(viewModel = viewModel)
                /*val coroutineScope = rememberCoroutineScope()
                val scaffoldState = rememberScaffoldState()

                Scaffold(
                    scaffoldState = scaffoldState,
                    drawerContent = {
                        AppDrawer(
                            currentScreen = Screen.Notes,
                            closeDrawerAction = {
                                coroutineScope.launch {
                                    scaffoldState.drawerState.close()
                                }
                            }
                        )
                    },
                    content = {
                        Note()
                    }
                )*/
            }
        }
    }
}

