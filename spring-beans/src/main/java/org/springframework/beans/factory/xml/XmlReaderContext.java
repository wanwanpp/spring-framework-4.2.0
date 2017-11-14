/*
 * Copyright 2002-2014 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.beans.factory.xml;

import org.springframework.beans.factory.BeanDefinitionStoreException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.parsing.ProblemReporter;
import org.springframework.beans.factory.parsing.ReaderContext;
import org.springframework.beans.factory.parsing.ReaderEventListener;
import org.springframework.beans.factory.parsing.SourceExtractor;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.w3c.dom.Document;
import org.xml.sax.InputSource;

import java.io.StringReader;

/**
 * Extension of {@link org.springframework.beans.factory.parsing.ReaderContext},
 * specific to use with an {@link XmlBeanDefinitionReader}. Provides access to the
 * {@link NamespaceHandlerResolver} configured in the {@link XmlBeanDefinitionReader}.
 *
 * @author Rob Harrop
 * @author Juergen Hoeller
 * @since 2.0
 */
public class XmlReaderContext extends ReaderContext {

	private final XmlBeanDefinitionReader reader;

	private final NamespaceHandlerResolver namespaceHandlerResolver;


	public XmlReaderContext(
			Resource resource, ProblemReporter problemReporter,
			ReaderEventListener eventListener, SourceExtractor sourceExtractor,
			XmlBeanDefinitionReader reader, NamespaceHandlerResolver namespaceHandlerResolver) {

		super(resource, problemReporter, eventListener, sourceExtractor);
		this.reader = reader;
		this.namespaceHandlerResolver = namespaceHandlerResolver;
	}


	public final XmlBeanDefinitionReader getReader() {
		return this.reader;
	}

	public final BeanDefinitionRegistry getRegistry() {
		return this.reader.getRegistry();
	}

	public final ResourceLoader getResourceLoader() {
		return this.reader.getResourceLoader();
	}

	public final ClassLoader getBeanClassLoader() {
		return this.reader.getBeanClassLoader();
	}

	public final Environment getEnvironment() {
		return this.reader.getEnvironment();
	}

	public final NamespaceHandlerResolver getNamespaceHandlerResolver() {
		return this.namespaceHandlerResolver;
	}


	public String generateBeanName(BeanDefinition beanDefinition) {
		return this.reader.getBeanNameGenerator().generateBeanName(beanDefinition, getRegistry());
	}

	public String registerWithGeneratedName(BeanDefinition beanDefinition) {
		/**
		 * 获取注册的名字BeanName，和<bean>的注册差不多，使用的是Class全路径+"#"+全局计数器的方式，
		 * 其中的Class全路径为org.springframework.aop.aspectj.AspectJPointcutAdvisor，依次类推，
		 * 每一个BeanName应当为org.springframework.aop.aspectj.AspectJPointcutAdvisor#0、
		 * org.springframework.aop.aspectj.AspectJPointcutAdvisor#1、
		 *org.springframework.aop.aspectj.AspectJPointcutAdvisor#2    这样下去。
		 */
		String generatedName = generateBeanName(beanDefinition);
		getRegistry().registerBeanDefinition(generatedName, beanDefinition);
		return generatedName;
	}

	public Document readDocumentFromString(String documentContent) {
		InputSource is = new InputSource(new StringReader(documentContent));
		try {
			return this.reader.doLoadDocument(is, getResource());
		}
		catch (Exception ex) {
			throw new BeanDefinitionStoreException("Failed to read XML document", ex);
		}
	}

}
