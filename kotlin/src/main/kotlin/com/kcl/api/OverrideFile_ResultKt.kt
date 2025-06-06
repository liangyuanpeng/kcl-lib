// Generated by the protocol buffer compiler. DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: spec.proto

// Generated files should ignore deprecation warnings
@file:Suppress("DEPRECATION")
package com.kcl.api;

@kotlin.jvm.JvmName("-initializeoverrideFileResult")
public inline fun overrideFileResult(block: com.kcl.api.OverrideFile_ResultKt.Dsl.() -> kotlin.Unit): com.kcl.api.Spec.OverrideFile_Result =
  com.kcl.api.OverrideFile_ResultKt.Dsl._create(com.kcl.api.Spec.OverrideFile_Result.newBuilder()).apply { block() }._build()
/**
 * ```
 * Message for override file response.
 * ```
 *
 * Protobuf type `com.kcl.api.OverrideFile_Result`
 */
public object OverrideFile_ResultKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: com.kcl.api.Spec.OverrideFile_Result.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
      internal fun _create(builder: com.kcl.api.Spec.OverrideFile_Result.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
  @kotlin.PublishedApi
    internal fun _build(): com.kcl.api.Spec.OverrideFile_Result = _builder.build()

    /**
     * ```
     * Result of the override operation.
     * ```
     *
     * `bool result = 1;`
     */
    public var result: kotlin.Boolean
      @JvmName("getResult")
      get() = _builder.result
      @JvmName("setResult")
      set(value) {
        _builder.result = value
      }
    /**
     * ```
     * Result of the override operation.
     * ```
     *
     * `bool result = 1;`
     */
    public fun clearResult() {
      _builder.clearResult()
    }

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class ParseErrorsProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * ```
     * List of parse errors encountered.
     * ```
     *
     * `repeated .com.kcl.api.Error parse_errors = 2;`
     */
     public val parseErrors: com.google.protobuf.kotlin.DslList<com.kcl.api.Spec.Error, ParseErrorsProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.parseErrorsList
      )
    /**
     * ```
     * List of parse errors encountered.
     * ```
     *
     * `repeated .com.kcl.api.Error parse_errors = 2;`
     * @param value The parseErrors to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addParseErrors")
    public fun com.google.protobuf.kotlin.DslList<com.kcl.api.Spec.Error, ParseErrorsProxy>.add(value: com.kcl.api.Spec.Error) {
      _builder.addParseErrors(value)
    }
    /**
     * ```
     * List of parse errors encountered.
     * ```
     *
     * `repeated .com.kcl.api.Error parse_errors = 2;`
     * @param value The parseErrors to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignParseErrors")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<com.kcl.api.Spec.Error, ParseErrorsProxy>.plusAssign(value: com.kcl.api.Spec.Error) {
      add(value)
    }
    /**
     * ```
     * List of parse errors encountered.
     * ```
     *
     * `repeated .com.kcl.api.Error parse_errors = 2;`
     * @param values The parseErrors to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllParseErrors")
    public fun com.google.protobuf.kotlin.DslList<com.kcl.api.Spec.Error, ParseErrorsProxy>.addAll(values: kotlin.collections.Iterable<com.kcl.api.Spec.Error>) {
      _builder.addAllParseErrors(values)
    }
    /**
     * ```
     * List of parse errors encountered.
     * ```
     *
     * `repeated .com.kcl.api.Error parse_errors = 2;`
     * @param values The parseErrors to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllParseErrors")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<com.kcl.api.Spec.Error, ParseErrorsProxy>.plusAssign(values: kotlin.collections.Iterable<com.kcl.api.Spec.Error>) {
      addAll(values)
    }
    /**
     * ```
     * List of parse errors encountered.
     * ```
     *
     * `repeated .com.kcl.api.Error parse_errors = 2;`
     * @param index The index to set the value at.
     * @param value The parseErrors to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setParseErrors")
    public operator fun com.google.protobuf.kotlin.DslList<com.kcl.api.Spec.Error, ParseErrorsProxy>.set(index: kotlin.Int, value: com.kcl.api.Spec.Error) {
      _builder.setParseErrors(index, value)
    }
    /**
     * ```
     * List of parse errors encountered.
     * ```
     *
     * `repeated .com.kcl.api.Error parse_errors = 2;`
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearParseErrors")
    public fun com.google.protobuf.kotlin.DslList<com.kcl.api.Spec.Error, ParseErrorsProxy>.clear() {
      _builder.clearParseErrors()
    }

  }
}
@kotlin.jvm.JvmSynthetic
public inline fun com.kcl.api.Spec.OverrideFile_Result.copy(block: `com.kcl.api`.OverrideFile_ResultKt.Dsl.() -> kotlin.Unit): com.kcl.api.Spec.OverrideFile_Result =
  `com.kcl.api`.OverrideFile_ResultKt.Dsl._create(this.toBuilder()).apply { block() }._build()

