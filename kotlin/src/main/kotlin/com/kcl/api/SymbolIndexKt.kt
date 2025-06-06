// Generated by the protocol buffer compiler. DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: spec.proto

// Generated files should ignore deprecation warnings
@file:Suppress("DEPRECATION")
package com.kcl.api;

@kotlin.jvm.JvmName("-initializesymbolIndex")
public inline fun symbolIndex(block: com.kcl.api.SymbolIndexKt.Dsl.() -> kotlin.Unit): com.kcl.api.Spec.SymbolIndex =
  com.kcl.api.SymbolIndexKt.Dsl._create(com.kcl.api.Spec.SymbolIndex.newBuilder()).apply { block() }._build()
/**
 * ```
 * Message representing a symbol index.
 * ```
 *
 * Protobuf type `com.kcl.api.SymbolIndex`
 */
public object SymbolIndexKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: com.kcl.api.Spec.SymbolIndex.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
      internal fun _create(builder: com.kcl.api.Spec.SymbolIndex.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
  @kotlin.PublishedApi
    internal fun _build(): com.kcl.api.Spec.SymbolIndex = _builder.build()

    /**
     * ```
     * Index identifier.
     * ```
     *
     * `uint64 i = 1;`
     */
    public var i: kotlin.Long
      @JvmName("getI")
      get() = _builder.i
      @JvmName("setI")
      set(value) {
        _builder.i = value
      }
    /**
     * ```
     * Index identifier.
     * ```
     *
     * `uint64 i = 1;`
     */
    public fun clearI() {
      _builder.clearI()
    }

    /**
     * ```
     * Global identifier.
     * ```
     *
     * `uint64 g = 2;`
     */
    public var g: kotlin.Long
      @JvmName("getG")
      get() = _builder.g
      @JvmName("setG")
      set(value) {
        _builder.g = value
      }
    /**
     * ```
     * Global identifier.
     * ```
     *
     * `uint64 g = 2;`
     */
    public fun clearG() {
      _builder.clearG()
    }

    /**
     * ```
     * Type of the symbol or scope.
     * ```
     *
     * `string kind = 3;`
     */
    public var kind: kotlin.String
      @JvmName("getKind")
      get() = _builder.kind
      @JvmName("setKind")
      set(value) {
        _builder.kind = value
      }
    /**
     * ```
     * Type of the symbol or scope.
     * ```
     *
     * `string kind = 3;`
     */
    public fun clearKind() {
      _builder.clearKind()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun com.kcl.api.Spec.SymbolIndex.copy(block: `com.kcl.api`.SymbolIndexKt.Dsl.() -> kotlin.Unit): com.kcl.api.Spec.SymbolIndex =
  `com.kcl.api`.SymbolIndexKt.Dsl._create(this.toBuilder()).apply { block() }._build()

