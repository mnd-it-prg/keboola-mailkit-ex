/*
 */
package keboola.mailkit.extractor.state;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.Instant;
import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author David Esner <esnerda at gmail.com>
 * @created 2016
 */
public class LastState {

    @JsonProperty("lastRunDate")
    private Instant lastRunDate;

    private Long rawMessagesLastId;

    private Long rawResponsesLastId;

    private Long rawBouncesLastId;

    public LastState(Instant lastRunDate) {
        this.lastRunDate = lastRunDate;
    }

    public Instant getLastRunDate() {
        return lastRunDate;
    }

    public void setLastRunDate(Instant lastRunDate) {
        this.lastRunDate = lastRunDate;
    }

    public Long getRawMessagesLastId() {
        return rawMessagesLastId;
    }

    public void setRawMessagesLastId(Long rawMessagesLastId) {
        this.rawMessagesLastId = rawMessagesLastId;
    }

    public Long getRawResponsesLastId() {
        return rawResponsesLastId;
    }

    public void setRawResponsesLastId(Long rawResponsesLastId) {
        this.rawResponsesLastId = rawResponsesLastId;
    }

    public Long getRawBouncesLastId() {
        return rawBouncesLastId;
    }

    public void setRawBouncesLastId(Long rawBouncesLastId) {
        this.rawBouncesLastId = rawBouncesLastId;
    }

    public LastState() {
    }

}
