package dev.edgsel.ccredis_cli.resp.parser

import dev.edgsel.ccredis_cli.resp.RespMessage

interface RespMessageParser<T : RespMessage> {
    fun deserialize(input: String): T
    fun serialize(input: T): String
}
