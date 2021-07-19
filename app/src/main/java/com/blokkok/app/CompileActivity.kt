package com.blokkok.app

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.blokkok.app.fragments.compiler.CompileFragment
import com.blokkok.app.managers.projects.ProjectsManager

class CompileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_compile)

        if (intent.hasExtra("project_id")) {
            val projectId = intent.getStringExtra("project_id")!!

            supportFragmentManager
                .beginTransaction()
                .replace(R.id.activity_compile_root, CompileFragment(project = ProjectsManager.getProject(projectId)!!))
                .commit()

        } else {
            val libraryName = intent.getStringExtra("library_name")!!

            supportFragmentManager
                .beginTransaction()
                .replace(R.id.activity_compile_root, CompileFragment(libraryName = libraryName))
                .commit()
        }
    }
}