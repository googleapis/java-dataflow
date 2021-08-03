/*
 * Copyright 2021 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.dataflow.v1beta3.stub;

import static com.google.dataflow.v1beta3.MessagesV1Beta3Client.ListJobMessagesPagedResponse;

import com.google.api.core.ApiFunction;
import com.google.api.core.ApiFuture;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.GaxProperties;
import com.google.api.gax.core.GoogleCredentialsProvider;
import com.google.api.gax.core.InstantiatingExecutorProvider;
import com.google.api.gax.grpc.GaxGrpcProperties;
import com.google.api.gax.grpc.GrpcTransportChannel;
import com.google.api.gax.grpc.InstantiatingGrpcChannelProvider;
import com.google.api.gax.retrying.RetrySettings;
import com.google.api.gax.rpc.ApiCallContext;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.PageContext;
import com.google.api.gax.rpc.PagedCallSettings;
import com.google.api.gax.rpc.PagedListDescriptor;
import com.google.api.gax.rpc.PagedListResponseFactory;
import com.google.api.gax.rpc.StatusCode;
import com.google.api.gax.rpc.StubSettings;
import com.google.api.gax.rpc.TransportChannelProvider;
import com.google.api.gax.rpc.UnaryCallSettings;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.google.dataflow.v1beta3.JobMessage;
import com.google.dataflow.v1beta3.ListJobMessagesRequest;
import com.google.dataflow.v1beta3.ListJobMessagesResponse;
import java.io.IOException;
import java.util.List;
import javax.annotation.Generated;
import org.threeten.bp.Duration;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Settings class to configure an instance of {@link MessagesV1Beta3Stub}.
 *
 * <p>The default instance has everything set to sensible defaults:
 *
 * <ul>
 *   <li> The default service address (dataflow.googleapis.com) and default port (443) are used.
 *   <li> Credentials are acquired automatically through Application Default Credentials.
 *   <li> Retries are configured for idempotent methods but not for non-idempotent methods.
 * </ul>
 *
 * <p>The builder of this class is recursive, so contained classes are themselves builders. When
 * build() is called, the tree of builders is called to create the complete settings object.
 *
 * <p>For example, to set the total timeout of listJobMessages to 30 seconds:
 *
 * <pre>{@code
 * MessagesV1Beta3StubSettings.Builder messagesV1Beta3SettingsBuilder =
 *     MessagesV1Beta3StubSettings.newBuilder();
 * messagesV1Beta3SettingsBuilder
 *     .listJobMessagesSettings()
 *     .setRetrySettings(
 *         messagesV1Beta3SettingsBuilder
 *             .listJobMessagesSettings()
 *             .getRetrySettings()
 *             .toBuilder()
 *             .setTotalTimeout(Duration.ofSeconds(30))
 *             .build());
 * MessagesV1Beta3StubSettings messagesV1Beta3Settings = messagesV1Beta3SettingsBuilder.build();
 * }</pre>
 */
@BetaApi
@Generated("by gapic-generator-java")
public class MessagesV1Beta3StubSettings extends StubSettings<MessagesV1Beta3StubSettings> {
  /** The default scopes of the service. */
  private static final ImmutableList<String> DEFAULT_SERVICE_SCOPES =
      ImmutableList.<String>builder()
          .add("https://www.googleapis.com/auth/cloud-platform")
          .add("https://www.googleapis.com/auth/compute")
          .add("https://www.googleapis.com/auth/compute.readonly")
          .add("https://www.googleapis.com/auth/userinfo.email")
          .build();

  private final PagedCallSettings<
          ListJobMessagesRequest, ListJobMessagesResponse, ListJobMessagesPagedResponse>
      listJobMessagesSettings;

  private static final PagedListDescriptor<
          ListJobMessagesRequest, ListJobMessagesResponse, JobMessage>
      LIST_JOB_MESSAGES_PAGE_STR_DESC =
          new PagedListDescriptor<ListJobMessagesRequest, ListJobMessagesResponse, JobMessage>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public ListJobMessagesRequest injectToken(
                ListJobMessagesRequest payload, String token) {
              return ListJobMessagesRequest.newBuilder(payload).setPageToken(token).build();
            }

            @Override
            public ListJobMessagesRequest injectPageSize(
                ListJobMessagesRequest payload, int pageSize) {
              return ListJobMessagesRequest.newBuilder(payload).setPageSize(pageSize).build();
            }

            @Override
            public Integer extractPageSize(ListJobMessagesRequest payload) {
              return payload.getPageSize();
            }

            @Override
            public String extractNextToken(ListJobMessagesResponse payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<JobMessage> extractResources(ListJobMessagesResponse payload) {
              return payload.getJobMessagesList() == null
                  ? ImmutableList.<JobMessage>of()
                  : payload.getJobMessagesList();
            }
          };

  private static final PagedListResponseFactory<
          ListJobMessagesRequest, ListJobMessagesResponse, ListJobMessagesPagedResponse>
      LIST_JOB_MESSAGES_PAGE_STR_FACT =
          new PagedListResponseFactory<
              ListJobMessagesRequest, ListJobMessagesResponse, ListJobMessagesPagedResponse>() {
            @Override
            public ApiFuture<ListJobMessagesPagedResponse> getFuturePagedResponse(
                UnaryCallable<ListJobMessagesRequest, ListJobMessagesResponse> callable,
                ListJobMessagesRequest request,
                ApiCallContext context,
                ApiFuture<ListJobMessagesResponse> futureResponse) {
              PageContext<ListJobMessagesRequest, ListJobMessagesResponse, JobMessage> pageContext =
                  PageContext.create(callable, LIST_JOB_MESSAGES_PAGE_STR_DESC, request, context);
              return ListJobMessagesPagedResponse.createAsync(pageContext, futureResponse);
            }
          };

  /** Returns the object with the settings used for calls to listJobMessages. */
  public PagedCallSettings<
          ListJobMessagesRequest, ListJobMessagesResponse, ListJobMessagesPagedResponse>
      listJobMessagesSettings() {
    return listJobMessagesSettings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public MessagesV1Beta3Stub createStub() throws IOException {
    if (getTransportChannelProvider()
        .getTransportName()
        .equals(GrpcTransportChannel.getGrpcTransportName())) {
      return GrpcMessagesV1Beta3Stub.create(this);
    }
    throw new UnsupportedOperationException(
        String.format(
            "Transport not supported: %s", getTransportChannelProvider().getTransportName()));
  }

  /** Returns a builder for the default ExecutorProvider for this service. */
  public static InstantiatingExecutorProvider.Builder defaultExecutorProviderBuilder() {
    return InstantiatingExecutorProvider.newBuilder();
  }

  /** Returns the default service endpoint. */
  public static String getDefaultEndpoint() {
    return "dataflow.googleapis.com:443";
  }

  /** Returns the default mTLS service endpoint. */
  public static String getDefaultMtlsEndpoint() {
    return "dataflow.mtls.googleapis.com:443";
  }

  /** Returns the default service scopes. */
  public static List<String> getDefaultServiceScopes() {
    return DEFAULT_SERVICE_SCOPES;
  }

  /** Returns a builder for the default credentials for this service. */
  public static GoogleCredentialsProvider.Builder defaultCredentialsProviderBuilder() {
    return GoogleCredentialsProvider.newBuilder().setScopesToApply(DEFAULT_SERVICE_SCOPES);
  }

  /** Returns a builder for the default ChannelProvider for this service. */
  public static InstantiatingGrpcChannelProvider.Builder defaultGrpcTransportProviderBuilder() {
    return InstantiatingGrpcChannelProvider.newBuilder()
        .setMaxInboundMessageSize(Integer.MAX_VALUE);
  }

  public static TransportChannelProvider defaultTransportChannelProvider() {
    return defaultGrpcTransportProviderBuilder().build();
  }

  @BetaApi("The surface for customizing headers is not stable yet and may change in the future.")
  public static ApiClientHeaderProvider.Builder defaultApiClientHeaderProviderBuilder() {
    return ApiClientHeaderProvider.newBuilder()
        .setGeneratedLibToken(
            "gapic", GaxProperties.getLibraryVersion(MessagesV1Beta3StubSettings.class))
        .setTransportToken(
            GaxGrpcProperties.getGrpcTokenName(), GaxGrpcProperties.getGrpcVersion());
  }

  /** Returns a new builder for this class. */
  public static Builder newBuilder() {
    return Builder.createDefault();
  }

  /** Returns a new builder for this class. */
  public static Builder newBuilder(ClientContext clientContext) {
    return new Builder(clientContext);
  }

  /** Returns a builder containing all the values of this settings class. */
  public Builder toBuilder() {
    return new Builder(this);
  }

  protected MessagesV1Beta3StubSettings(Builder settingsBuilder) throws IOException {
    super(settingsBuilder);

    listJobMessagesSettings = settingsBuilder.listJobMessagesSettings().build();
  }

  /** Builder for MessagesV1Beta3StubSettings. */
  public static class Builder extends StubSettings.Builder<MessagesV1Beta3StubSettings, Builder> {
    private final ImmutableList<UnaryCallSettings.Builder<?, ?>> unaryMethodSettingsBuilders;
    private final PagedCallSettings.Builder<
            ListJobMessagesRequest, ListJobMessagesResponse, ListJobMessagesPagedResponse>
        listJobMessagesSettings;
    private static final ImmutableMap<String, ImmutableSet<StatusCode.Code>>
        RETRYABLE_CODE_DEFINITIONS;

    static {
      ImmutableMap.Builder<String, ImmutableSet<StatusCode.Code>> definitions =
          ImmutableMap.builder();
      definitions.put(
          "no_retry_0_codes", ImmutableSet.copyOf(Lists.<StatusCode.Code>newArrayList()));
      RETRYABLE_CODE_DEFINITIONS = definitions.build();
    }

    private static final ImmutableMap<String, RetrySettings> RETRY_PARAM_DEFINITIONS;

    static {
      ImmutableMap.Builder<String, RetrySettings> definitions = ImmutableMap.builder();
      RetrySettings settings = null;
      settings =
          RetrySettings.newBuilder()
              .setInitialRpcTimeout(Duration.ofMillis(60000L))
              .setRpcTimeoutMultiplier(1.0)
              .setMaxRpcTimeout(Duration.ofMillis(60000L))
              .setTotalTimeout(Duration.ofMillis(60000L))
              .build();
      definitions.put("no_retry_0_params", settings);
      RETRY_PARAM_DEFINITIONS = definitions.build();
    }

    protected Builder() {
      this(((ClientContext) null));
    }

    protected Builder(ClientContext clientContext) {
      super(clientContext);

      listJobMessagesSettings = PagedCallSettings.newBuilder(LIST_JOB_MESSAGES_PAGE_STR_FACT);

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(listJobMessagesSettings);
      initDefaults(this);
    }

    protected Builder(MessagesV1Beta3StubSettings settings) {
      super(settings);

      listJobMessagesSettings = settings.listJobMessagesSettings.toBuilder();

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(listJobMessagesSettings);
    }

    private static Builder createDefault() {
      Builder builder = new Builder(((ClientContext) null));

      builder.setTransportChannelProvider(defaultTransportChannelProvider());
      builder.setCredentialsProvider(defaultCredentialsProviderBuilder().build());
      builder.setInternalHeaderProvider(defaultApiClientHeaderProviderBuilder().build());
      builder.setEndpoint(getDefaultEndpoint());
      builder.setMtlsEndpoint(getDefaultMtlsEndpoint());
      builder.setSwitchToMtlsEndpointAllowed(true);

      return initDefaults(builder);
    }

    private static Builder initDefaults(Builder builder) {
      builder
          .listJobMessagesSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_0_params"));

      return builder;
    }

    // NEXT_MAJOR_VER: remove 'throws Exception'.
    /**
     * Applies the given settings updater function to all of the unary API methods in this service.
     *
     * <p>Note: This method does not support applying settings to streaming methods.
     */
    public Builder applyToAllUnaryMethods(
        ApiFunction<UnaryCallSettings.Builder<?, ?>, Void> settingsUpdater) throws Exception {
      super.applyToAllUnaryMethods(unaryMethodSettingsBuilders, settingsUpdater);
      return this;
    }

    public ImmutableList<UnaryCallSettings.Builder<?, ?>> unaryMethodSettingsBuilders() {
      return unaryMethodSettingsBuilders;
    }

    /** Returns the builder for the settings used for calls to listJobMessages. */
    public PagedCallSettings.Builder<
            ListJobMessagesRequest, ListJobMessagesResponse, ListJobMessagesPagedResponse>
        listJobMessagesSettings() {
      return listJobMessagesSettings;
    }

    @Override
    public MessagesV1Beta3StubSettings build() throws IOException {
      return new MessagesV1Beta3StubSettings(this);
    }
  }
}
