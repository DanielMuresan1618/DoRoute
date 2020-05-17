package com.example.doroute.data.database.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*


@Entity(tableName = "tasks")
data class TaskEntity(
    @PrimaryKey
    val taskId: String,

    @ColumnInfo(name = "locationId")
    val locationId: String,

    @ColumnInfo(name = "stateId")
    val statusId: String,

    @ColumnInfo(name = "title")
    val title: String,

    @ColumnInfo(name = "description")
    val description: String,

    @ColumnInfo(name = "due_date")
    val dueDate: Date
)

