// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mobilenetwork.implementation;

import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.PagedResponse;
import com.azure.core.http.rest.PagedResponseBase;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.resourcemanager.mobilenetwork.fluent.PacketCoreControlPlaneVersionsClient;
import com.azure.resourcemanager.mobilenetwork.fluent.models.PacketCoreControlPlaneVersionInner;
import com.azure.resourcemanager.mobilenetwork.models.PacketCoreControlPlaneVersionListResult;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in PacketCoreControlPlaneVersionsClient. */
public final class PacketCoreControlPlaneVersionsClientImpl implements PacketCoreControlPlaneVersionsClient {
    /** The proxy service used to perform REST calls. */
    private final PacketCoreControlPlaneVersionsService service;

    /** The service client containing this operation class. */
    private final MobileNetworkManagementClientImpl client;

    /**
     * Initializes an instance of PacketCoreControlPlaneVersionsClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    PacketCoreControlPlaneVersionsClientImpl(MobileNetworkManagementClientImpl client) {
        this.service =
            RestProxy
                .create(
                    PacketCoreControlPlaneVersionsService.class,
                    client.getHttpPipeline(),
                    client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for MobileNetworkManagementClientPacketCoreControlPlaneVersions to be
     * used by the proxy service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "MobileNetworkManagem")
    private interface PacketCoreControlPlaneVersionsService {
        @Headers({"Content-Type: application/json"})
        @Get("/providers/Microsoft.MobileNetwork/packetCoreControlPlaneVersions/{versionName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<PacketCoreControlPlaneVersionInner>> get(
            @HostParam("$host") String endpoint,
            @PathParam("versionName") String versionName,
            @QueryParam("api-version") String apiVersion,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Get("/providers/Microsoft.MobileNetwork/packetCoreControlPlaneVersions")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<PacketCoreControlPlaneVersionListResult>> listByResourceGroup(
            @HostParam("$host") String endpoint,
            @QueryParam("api-version") String apiVersion,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<PacketCoreControlPlaneVersionListResult>> listByResourceGroupNext(
            @PathParam(value = "nextLink", encoded = true) String nextLink,
            @HostParam("$host") String endpoint,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Gets information about the specified packet core control plane version.
     *
     * @param versionName The name of the packet core control plane version.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about the specified packet core control plane version along with {@link Response} on
     *     successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<PacketCoreControlPlaneVersionInner>> getWithResponseAsync(String versionName) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (versionName == null) {
            return Mono.error(new IllegalArgumentException("Parameter versionName is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service.get(this.client.getEndpoint(), versionName, this.client.getApiVersion(), accept, context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Gets information about the specified packet core control plane version.
     *
     * @param versionName The name of the packet core control plane version.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about the specified packet core control plane version along with {@link Response} on
     *     successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<PacketCoreControlPlaneVersionInner>> getWithResponseAsync(
        String versionName, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (versionName == null) {
            return Mono.error(new IllegalArgumentException("Parameter versionName is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service.get(this.client.getEndpoint(), versionName, this.client.getApiVersion(), accept, context);
    }

    /**
     * Gets information about the specified packet core control plane version.
     *
     * @param versionName The name of the packet core control plane version.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about the specified packet core control plane version on successful completion of {@link
     *     Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PacketCoreControlPlaneVersionInner> getAsync(String versionName) {
        return getWithResponseAsync(versionName).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Gets information about the specified packet core control plane version.
     *
     * @param versionName The name of the packet core control plane version.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about the specified packet core control plane version.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PacketCoreControlPlaneVersionInner get(String versionName) {
        return getAsync(versionName).block();
    }

    /**
     * Gets information about the specified packet core control plane version.
     *
     * @param versionName The name of the packet core control plane version.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about the specified packet core control plane version along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<PacketCoreControlPlaneVersionInner> getWithResponse(String versionName, Context context) {
        return getWithResponseAsync(versionName, context).block();
    }

    /**
     * Lists all supported packet core control planes versions.
     *
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for packet core control plane version API service call along with {@link PagedResponse} on
     *     successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<PacketCoreControlPlaneVersionInner>> listByResourceGroupSinglePageAsync() {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .listByResourceGroup(this.client.getEndpoint(), this.client.getApiVersion(), accept, context))
            .<PagedResponse<PacketCoreControlPlaneVersionInner>>map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Lists all supported packet core control planes versions.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for packet core control plane version API service call along with {@link PagedResponse} on
     *     successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<PacketCoreControlPlaneVersionInner>> listByResourceGroupSinglePageAsync(
        Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .listByResourceGroup(this.client.getEndpoint(), this.client.getApiVersion(), accept, context)
            .map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null));
    }

    /**
     * Lists all supported packet core control planes versions.
     *
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for packet core control plane version API service call as paginated response with {@link
     *     PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<PacketCoreControlPlaneVersionInner> listByResourceGroupAsync() {
        return new PagedFlux<>(
            () -> listByResourceGroupSinglePageAsync(), nextLink -> listByResourceGroupNextSinglePageAsync(nextLink));
    }

    /**
     * Lists all supported packet core control planes versions.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for packet core control plane version API service call as paginated response with {@link
     *     PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<PacketCoreControlPlaneVersionInner> listByResourceGroupAsync(Context context) {
        return new PagedFlux<>(
            () -> listByResourceGroupSinglePageAsync(context),
            nextLink -> listByResourceGroupNextSinglePageAsync(nextLink, context));
    }

    /**
     * Lists all supported packet core control planes versions.
     *
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for packet core control plane version API service call as paginated response with {@link
     *     PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<PacketCoreControlPlaneVersionInner> listByResourceGroup() {
        return new PagedIterable<>(listByResourceGroupAsync());
    }

    /**
     * Lists all supported packet core control planes versions.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for packet core control plane version API service call as paginated response with {@link
     *     PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<PacketCoreControlPlaneVersionInner> listByResourceGroup(Context context) {
        return new PagedIterable<>(listByResourceGroupAsync(context));
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The nextLink parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for packet core control plane version API service call along with {@link PagedResponse} on
     *     successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<PacketCoreControlPlaneVersionInner>> listByResourceGroupNextSinglePageAsync(
        String nextLink) {
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context -> service.listByResourceGroupNext(nextLink, this.client.getEndpoint(), accept, context))
            .<PagedResponse<PacketCoreControlPlaneVersionInner>>map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The nextLink parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for packet core control plane version API service call along with {@link PagedResponse} on
     *     successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<PacketCoreControlPlaneVersionInner>> listByResourceGroupNextSinglePageAsync(
        String nextLink, Context context) {
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .listByResourceGroupNext(nextLink, this.client.getEndpoint(), accept, context)
            .map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null));
    }
}