// Generated by the protocol buffer compiler. DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: spec.proto

// Generated files should ignore deprecation warnings
@file:Suppress("DEPRECATION")
package com.kcl.api;

@kotlin.jvm.JvmName("-initializeparseProgramResult")
public inline fun parseProgramResult(block: com.kcl.api.ParseProgram_ResultKt.Dsl.() -> kotlin.Unit): com.kcl.api.Spec.ParseProgram_Result =
  com.kcl.api.ParseProgram_ResultKt.Dsl._create(com.kcl.api.Spec.ParseProgram_Result.newBuilder()).apply { block() }._build()
/**
 * ```
 * Message for parse program response.
 * ```
 *
 * Protobuf type `com.kcl.api.ParseProgram_Result`
 */
public object ParseProgram_ResultKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: com.kcl.api.Spec.ParseProgram_Result.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
      internal fun _create(builder: com.kcl.api.Spec.ParseProgram_Result.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
  @kotlin.PublishedApi
    internal fun _build(): com.kcl.api.Spec.ParseProgram_Result = _builder.build()

    /**
     * ```
     * Abstract Syntax Tree (AST) in JSON format.
     * ```
     *
     * `string ast_json = 1;`
     */
    public var astJson: kotlin.String
      @JvmName("getAstJson")
      get() = _builder.astJson
      @JvmName("setAstJson")
      set(value) {
        _builder.astJson = value
      }
    /**
     * ```
     * Abstract Syntax Tree (AST) in JSON format.
     * ```
     *
     * `string ast_json = 1;`
     */
    public fun clearAstJson() {
      _builder.clearAstJson()
    }

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class PathsProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * ```
     * Returns the files in the order they should be compiled.
     * ```
     *
     * `repeated string paths = 2;`
     * @return A list containing the paths.
     */
    public val paths: com.google.protobuf.kotlin.DslList<kotlin.String, PathsProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.pathsList
      )
    /**
     * ```
     * Returns the files in the order they should be compiled.
     * ```
     *
     * `repeated string paths = 2;`
     * @param value The paths to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addPaths")
    public fun com.google.protobuf.kotlin.DslList<kotlin.String, PathsProxy>.add(value: kotlin.String) {
      _builder.addPaths(value)
    }
    /**
     * ```
     * Returns the files in the order they should be compiled.
     * ```
     *
     * `repeated string paths = 2;`
     * @param value The paths to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignPaths")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<kotlin.String, PathsProxy>.plusAssign(value: kotlin.String) {
      add(value)
    }
    /**
     * ```
     * Returns the files in the order they should be compiled.
     * ```
     *
     * `repeated string paths = 2;`
     * @param values The paths to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllPaths")
    public fun com.google.protobuf.kotlin.DslList<kotlin.String, PathsProxy>.addAll(values: kotlin.collections.Iterable<kotlin.String>) {
      _builder.addAllPaths(values)
    }
    /**
     * ```
     * Returns the files in the order they should be compiled.
     * ```
     *
     * `repeated string paths = 2;`
     * @param values The paths to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllPaths")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<kotlin.String, PathsProxy>.plusAssign(values: kotlin.collections.Iterable<kotlin.String>) {
      addAll(values)
    }
    /**
     * ```
     * Returns the files in the order they should be compiled.
     * ```
     *
     * `repeated string paths = 2;`
     * @param index The index to set the value at.
     * @param value The paths to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setPaths")
    public operator fun com.google.protobuf.kotlin.DslList<kotlin.String, PathsProxy>.set(index: kotlin.Int, value: kotlin.String) {
      _builder.setPaths(index, value)
    }/**
     * ```
     * Returns the files in the order they should be compiled.
     * ```
     *
     * `repeated string paths = 2;`
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearPaths")
    public fun com.google.protobuf.kotlin.DslList<kotlin.String, PathsProxy>.clear() {
      _builder.clearPaths()
    }
    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class ErrorsProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * ```
     * List of parse errors.
     * ```
     *
     * `repeated .com.kcl.api.Error errors = 3;`
     */
     public val errors: com.google.protobuf.kotlin.DslList<com.kcl.api.Spec.Error, ErrorsProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.errorsList
      )
    /**
     * ```
     * List of parse errors.
     * ```
     *
     * `repeated .com.kcl.api.Error errors = 3;`
     * @param value The errors to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addErrors")
    public fun com.google.protobuf.kotlin.DslList<com.kcl.api.Spec.Error, ErrorsProxy>.add(value: com.kcl.api.Spec.Error) {
      _builder.addErrors(value)
    }
    /**
     * ```
     * List of parse errors.
     * ```
     *
     * `repeated .com.kcl.api.Error errors = 3;`
     * @param value The errors to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignErrors")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<com.kcl.api.Spec.Error, ErrorsProxy>.plusAssign(value: com.kcl.api.Spec.Error) {
      add(value)
    }
    /**
     * ```
     * List of parse errors.
     * ```
     *
     * `repeated .com.kcl.api.Error errors = 3;`
     * @param values The errors to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllErrors")
    public fun com.google.protobuf.kotlin.DslList<com.kcl.api.Spec.Error, ErrorsProxy>.addAll(values: kotlin.collections.Iterable<com.kcl.api.Spec.Error>) {
      _builder.addAllErrors(values)
    }
    /**
     * ```
     * List of parse errors.
     * ```
     *
     * `repeated .com.kcl.api.Error errors = 3;`
     * @param values The errors to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllErrors")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<com.kcl.api.Spec.Error, ErrorsProxy>.plusAssign(values: kotlin.collections.Iterable<com.kcl.api.Spec.Error>) {
      addAll(values)
    }
    /**
     * ```
     * List of parse errors.
     * ```
     *
     * `repeated .com.kcl.api.Error errors = 3;`
     * @param index The index to set the value at.
     * @param value The errors to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setErrors")
    public operator fun com.google.protobuf.kotlin.DslList<com.kcl.api.Spec.Error, ErrorsProxy>.set(index: kotlin.Int, value: com.kcl.api.Spec.Error) {
      _builder.setErrors(index, value)
    }
    /**
     * ```
     * List of parse errors.
     * ```
     *
     * `repeated .com.kcl.api.Error errors = 3;`
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearErrors")
    public fun com.google.protobuf.kotlin.DslList<com.kcl.api.Spec.Error, ErrorsProxy>.clear() {
      _builder.clearErrors()
    }

  }
}
@kotlin.jvm.JvmSynthetic
public inline fun com.kcl.api.Spec.ParseProgram_Result.copy(block: `com.kcl.api`.ParseProgram_ResultKt.Dsl.() -> kotlin.Unit): com.kcl.api.Spec.ParseProgram_Result =
  `com.kcl.api`.ParseProgram_ResultKt.Dsl._create(this.toBuilder()).apply { block() }._build()

