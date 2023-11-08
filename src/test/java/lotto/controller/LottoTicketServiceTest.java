package lotto.controller;

import camp.nextstep.edu.missionutils.test.NsTest;
import lotto.Application;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

public class ServiceTest extends NsTest {
    @DisplayName("로또가 정상적으로 발행될 경우")
    @Test
    void issueLottoTicketTest() {
        // given
        ByteArrayInputStream in = new ByteArrayInputStream("4000\n".getBytes());
        System.setIn(in);

        // when/then
        assertDoesNotThrow(() -> {
            Service lottoTicketCounter = new Service();
            lottoTicketCounter.issueLottoTicket();
        });
    }

    @Override
    protected void runMain() {
        Application.main(new String[]{});}
}
