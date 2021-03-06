/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.taskrouter.v1.workspace.worker;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.base.MoreObjects;
import com.twilio.base.Resource;
import com.twilio.converter.Converter;
import com.twilio.exception.ApiConnectionException;
import com.twilio.exception.ApiException;
import com.twilio.exception.RestException;
import com.twilio.http.HttpMethod;
import com.twilio.http.Request;
import com.twilio.http.Response;
import com.twilio.http.TwilioRestClient;
import com.twilio.rest.Domains;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.util.Map;
import java.util.Objects;

@JsonIgnoreProperties(ignoreUnknown = true)
public class WorkerStatistics extends Resource {
    private static final long serialVersionUID = 174560494604680L;

    /**
     * Create a WorkerStatisticsFetcher to execute fetch.
     * 
     * @param pathWorkspaceSid The workspace_sid
     * @param pathWorkerSid The worker_sid
     * @return WorkerStatisticsFetcher capable of executing the fetch
     */
    public static WorkerStatisticsFetcher fetcher(final String pathWorkspaceSid, 
                                                  final String pathWorkerSid) {
        return new WorkerStatisticsFetcher(pathWorkspaceSid, pathWorkerSid);
    }

    /**
     * Converts a JSON String into a WorkerStatistics object using the provided
     * ObjectMapper.
     * 
     * @param json Raw JSON String
     * @param objectMapper Jackson ObjectMapper
     * @return WorkerStatistics object represented by the provided JSON
     */
    public static WorkerStatistics fromJson(final String json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, WorkerStatistics.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    /**
     * Converts a JSON InputStream into a WorkerStatistics object using the provided
     * ObjectMapper.
     * 
     * @param json Raw JSON InputStream
     * @param objectMapper Jackson ObjectMapper
     * @return WorkerStatistics object represented by the provided JSON
     */
    public static WorkerStatistics fromJson(final InputStream json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, WorkerStatistics.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    private final String accountSid;
    private final Map<String, Object> cumulative;
    private final String workerSid;
    private final String workspaceSid;
    private final URI url;

    @JsonCreator
    private WorkerStatistics(@JsonProperty("account_sid")
                             final String accountSid, 
                             @JsonProperty("cumulative")
                             final Map<String, Object> cumulative, 
                             @JsonProperty("worker_sid")
                             final String workerSid, 
                             @JsonProperty("workspace_sid")
                             final String workspaceSid, 
                             @JsonProperty("url")
                             final URI url) {
        this.accountSid = accountSid;
        this.cumulative = cumulative;
        this.workerSid = workerSid;
        this.workspaceSid = workspaceSid;
        this.url = url;
    }

    /**
     * Returns The The account_sid.
     * 
     * @return The account_sid
     */
    public final String getAccountSid() {
        return this.accountSid;
    }

    /**
     * Returns The The cumulative.
     * 
     * @return The cumulative
     */
    public final Map<String, Object> getCumulative() {
        return this.cumulative;
    }

    /**
     * Returns The The worker_sid.
     * 
     * @return The worker_sid
     */
    public final String getWorkerSid() {
        return this.workerSid;
    }

    /**
     * Returns The The workspace_sid.
     * 
     * @return The workspace_sid
     */
    public final String getWorkspaceSid() {
        return this.workspaceSid;
    }

    /**
     * Returns The The url.
     * 
     * @return The url
     */
    public final URI getUrl() {
        return this.url;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        WorkerStatistics other = (WorkerStatistics) o;

        return Objects.equals(accountSid, other.accountSid) && 
               Objects.equals(cumulative, other.cumulative) && 
               Objects.equals(workerSid, other.workerSid) && 
               Objects.equals(workspaceSid, other.workspaceSid) && 
               Objects.equals(url, other.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountSid,
                            cumulative,
                            workerSid,
                            workspaceSid,
                            url);
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                          .add("accountSid", accountSid)
                          .add("cumulative", cumulative)
                          .add("workerSid", workerSid)
                          .add("workspaceSid", workspaceSid)
                          .add("url", url)
                          .toString();
    }
}