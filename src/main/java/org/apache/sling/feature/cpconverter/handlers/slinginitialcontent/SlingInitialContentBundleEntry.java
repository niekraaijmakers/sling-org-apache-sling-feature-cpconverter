/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements. See the NOTICE file distributed with this
 * work for additional information regarding copyright ownership. The ASF
 * licenses this file to You under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package org.apache.sling.feature.cpconverter.handlers.slinginitialcontent;

import org.apache.sling.jcr.contentloader.PathEntry;

import java.io.File;
import java.util.Objects;
import java.util.jar.JarEntry;

public class SlingInitialContentBundleEntry {
    
    
    private final JarEntry jarEntry;
    private final File targetFile;
    private final PathEntry pathEntry;
    private final String repositoryPath;

    public SlingInitialContentBundleEntry(JarEntry jarEntry, File targetFile, PathEntry pathEntry, String repositoryPath) {
        this.jarEntry = jarEntry;
        this.targetFile = targetFile;
        this.pathEntry = pathEntry;
        this.repositoryPath = repositoryPath;
    }

    public JarEntry getJarEntry() {
        return jarEntry;
    }

    public File getTargetFile() {
        return targetFile;
    }

    public PathEntry getPathEntry() {
        return pathEntry;
    }

    public String getRepositoryPath() {
        return repositoryPath;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SlingInitialContentBundleEntry that = (SlingInitialContentBundleEntry) o;
        return repositoryPath.equals(that.repositoryPath);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jarEntry, targetFile, pathEntry, repositoryPath);
    }
}