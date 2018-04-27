/*
 * Copyright 2000-2016 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.intellij.devkt.lang.properties;

import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.kotlin.com.intellij.openapi.fileTypes.LanguageFileType;

import javax.swing.*;

/**
 * @author max
 */
public class PropertiesFileType extends LanguageFileType {
	public static final @NotNull LanguageFileType INSTANCE = new PropertiesFileType();
	@NonNls
	public static final String DEFAULT_EXTENSION = "properties";
	@NonNls
	public static final String DOT_DEFAULT_EXTENSION = "." + DEFAULT_EXTENSION;

	private PropertiesFileType() {
		super(PropertiesLanguage.INSTANCE);
	}

	@Override
	@NotNull
	public String getName() {
		return "Properties";
	}

	@Override
	@NotNull
	public String getDescription() {
		return PropertiesBundle.message("properties.files.file.type.description");
	}

	@Override
	@NotNull
	public String getDefaultExtension() {
		return DEFAULT_EXTENSION;
	}

	@Override
	public Icon getIcon() {
		return PropretiesIcons.FILE;
	}
}
