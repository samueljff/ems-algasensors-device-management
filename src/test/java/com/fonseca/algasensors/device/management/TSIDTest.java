package com.fonseca.algasensors.device.management;

import com.fonseca.algasensors.device.management.common.IdGenerator;
import io.hypersistence.tsid.TSID;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;


class TSIDTest {

    @Test
    void shouldGenetateTSID(){
        TSID tsid = IdGenerator.generateTsid();

        // Timestamp original (UTC)
        Instant utcInstant = tsid.getInstant();

        // Converter para hor�rio do Brasil
        ZonedDateTime brasiliaTime = utcInstant.atZone(ZoneId.of("America/Sao_Paulo"));
        System.out.println("TSID: " + tsid);
        System.out.println("Long: " + tsid.toLong());
        System.out.println("UTC: " + utcInstant);
        System.out.println("Brasília: " + brasiliaTime);

        Assertions.assertThat(tsid.getInstant()).isCloseTo(Instant.now(), Assertions.within(1, ChronoUnit.MINUTES));
    }
}
