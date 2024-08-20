package com.example.cusrecyclerfaslha.remoteServer.model

data class Report(
    val to: String,
    val ok: Boolean
)

data class MainModel(
    val success: Int,
    val ok: Boolean,
    val message: String,
    val report: ArrayList<Report>
)
