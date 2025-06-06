// Generated by the protocol buffer compiler. DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: spec.proto

// Generated files should ignore deprecation warnings
@file:Suppress("DEPRECATION")
package com.kcl.api;

@kotlin.jvm.JvmName("-initializeupdateDependenciesArgs")
public inline fun updateDependenciesArgs(block: com.kcl.api.UpdateDependencies_ArgsKt.Dsl.() -> kotlin.Unit): com.kcl.api.Spec.UpdateDependencies_Args =
  com.kcl.api.UpdateDependencies_ArgsKt.Dsl._create(com.kcl.api.Spec.UpdateDependencies_Args.newBuilder()).apply { block() }._build()
/**
 * ```
 * Message for update dependencies request arguments.
 * ```
 *
 * Protobuf type `com.kcl.api.UpdateDependencies_Args`
 */
public object UpdateDependencies_ArgsKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: com.kcl.api.Spec.UpdateDependencies_Args.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
      internal fun _create(builder: com.kcl.api.Spec.UpdateDependencies_Args.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
  @kotlin.PublishedApi
    internal fun _build(): com.kcl.api.Spec.UpdateDependencies_Args = _builder.build()

    /**
     * ```
     * Path to the manifest file.
     * ```
     *
     * `string manifest_path = 1;`
     */
    public var manifestPath: kotlin.String
      @JvmName("getManifestPath")
      get() = _builder.manifestPath
      @JvmName("setManifestPath")
      set(value) {
        _builder.manifestPath = value
      }
    /**
     * ```
     * Path to the manifest file.
     * ```
     *
     * `string manifest_path = 1;`
     */
    public fun clearManifestPath() {
      _builder.clearManifestPath()
    }

    /**
     * ```
     * Flag to vendor dependencies locally.
     * ```
     *
     * `bool vendor = 2;`
     */
    public var vendor: kotlin.Boolean
      @JvmName("getVendor")
      get() = _builder.vendor
      @JvmName("setVendor")
      set(value) {
        _builder.vendor = value
      }
    /**
     * ```
     * Flag to vendor dependencies locally.
     * ```
     *
     * `bool vendor = 2;`
     */
    public fun clearVendor() {
      _builder.clearVendor()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun com.kcl.api.Spec.UpdateDependencies_Args.copy(block: `com.kcl.api`.UpdateDependencies_ArgsKt.Dsl.() -> kotlin.Unit): com.kcl.api.Spec.UpdateDependencies_Args =
  `com.kcl.api`.UpdateDependencies_ArgsKt.Dsl._create(this.toBuilder()).apply { block() }._build()

