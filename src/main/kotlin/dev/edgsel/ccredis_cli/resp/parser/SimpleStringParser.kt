package dev.edgsel.ccredis_cli.resp.parser

import dev.edgsel.ccredis_cli.resp.RespMessage
import dev.edgsel.ccredis_cli.resp.RespType
import dev.edgsel.ccredis_cli.resp.findByFirstType

class SimpleStringParser : RespMessageParser<RespMessage.SimpleStringMessage> {
    override fun deserialize(input: String): RespMessage.SimpleStringMessage {
        return RespMessage.SimpleStringMessage(formatMessage(input))
    }

    override fun serialize(input: RespMessage.SimpleStringMessage): String {
        TODO("Not yet implemented")
    }

    private fun formatMessage(input: String): String {
        val respType: RespType = getRespType(input[0].toString())

        return input
            .replace(respType.firstByte, "")
            .replace(Regex("[\r\n]"), "")
    }

    private fun getRespType(firstByte: String): RespType {
        return findByFirstType(firstByte) ?: throw IllegalArgumentException("RESP type by first byte $firstByte is not found")
    }
}
