package org.toml.lang

import com.intellij.openapi.fileTypes.ExactFileNameMatcher
import com.intellij.openapi.fileTypes.ExtensionFileNameMatcher
import com.intellij.openapi.fileTypes.FileTypeConsumer
import com.intellij.openapi.fileTypes.FileTypeFactory


class TomlFileTypeFactory : FileTypeFactory() {
    override fun createFileTypes(consumer: FileTypeConsumer) {
        consumer.consume(TomlFileType,
            ExactFileNameMatcher("Cargo.lock"),
            ExactFileNameMatcher("Gopkg.lock"),
            ExtensionFileNameMatcher(TomlFileType.DEFAULTS.EXTENSION))
    }
}
