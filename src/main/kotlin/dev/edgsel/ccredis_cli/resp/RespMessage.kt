package dev.edgsel.ccredis_cli.resp

sealed class RespMessage {

    data class SimpleStringMessage(val message: String) : RespMessage()
}
