package dev.edgsel.ccredis_cli.resp.parser

import dev.edgsel.ccredis_cli.resp.RespMessage

object GenericMessageParser {
    inline fun <reified T: RespMessage> deserialize(input: String, parser: RespMessageParser<T>): T {
        return parser.deserialize(input)
    }

    inline fun <reified T: RespMessage> serialize(input: T, parser: RespMessageParser<T>): String {
        return parser.serialize(input)
    }
}
