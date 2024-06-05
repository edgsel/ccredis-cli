package dev.edgsel.ccredis_cli.resp.parser

import dev.edgsel.ccredis_cli.resp.RespMessage
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SimpleStringParserUnitTest {

    private val simpleStringParser: RespMessageParser<RespMessage.SimpleStringMessage> = SimpleStringParser()

    @Test
    fun `Deserialize RESP simple string to formatted string`() {
        val result1 = simpleStringParser.deserialize("+OK\r\n")
        val result2 = simpleStringParser.deserialize("+hello world\r\n")

        assertEquals(result1.message, "OK")
        assertEquals(result2.message, "hello world")
    }
}
