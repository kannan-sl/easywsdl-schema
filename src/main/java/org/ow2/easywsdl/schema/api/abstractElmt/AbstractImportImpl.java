/**
 * easySchema - easyWSDL toolbox Platform.
 * Copyright (c) 2008,  eBM Websourcing
 * All rights reserved.
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 *     * Redistributions of source code must retain the above copyright
 *       notice, this list of conditions and the following disclaimer.
 *     * Redistributions in binary form must reproduce the above copyright
 *       notice, this list of conditions and the following disclaimer in the
 *       documentation and/or other materials provided with the distribution.
 *     * Neither the name of the University of California, Berkeley nor the
 *       names of its contributors may be used to endorse or promote products
 *       derived from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE REGENTS AND CONTRIBUTORS ``AS IS'' AND ANY
 * EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE REGENTS AND CONTRIBUTORS BE LIABLE FOR ANY
 * DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package org.ow2.easywsdl.schema.api.abstractElmt;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Map;

import org.apache.http.impl.client.HttpClientBuilder;
import org.ow2.easywsdl.schema.api.SchemaException;
import org.ow2.easywsdl.schema.api.SchemaReader.FeatureConstants;
import org.ow2.easywsdl.schema.api.absItf.AbsItfImport;
import org.ow2.easywsdl.schema.api.absItf.AbsItfSchema;

/**
 * @author Nicolas Salatge - eBM WebSourcing
 */
public abstract class AbstractImportImpl<E, S extends AbsItfSchema> extends AbstractIncludeImpl<E, S> implements AbsItfImport<S> {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor
	 *
	 * @param model
	 *            the model
	 * @param parent
	 *            the parent description
     * @throws URISyntaxException
     *             If the schemaLocation attribute of the import is not a valid
     *             URI.
	 */
	public AbstractImportImpl(final E model, final Map<FeatureConstants, Object> features, final
	Map<URI, AbsItfSchema> imports, final URI baseURI, AbstractSchemaReader reader,
			HttpClientBuilder httpClientBuilder) throws
			SchemaException, URISyntaxException {
		super(model, features, imports, baseURI, reader, httpClientBuilder);
	}

	/**
	 * Default constructor
	 *
	 * @param impt
	 *            the model
	 * @param parent
	 *            the parent description
     * @throws URISyntaxException
     *             If the schemaLocation attribute of the import is not a valid
     *             URI.
	 */
	public AbstractImportImpl(final E model, final AbstractSchemaElementImpl parent, final
	Map<URI, AbsItfSchema> imports, final URI baseURI, final AbstractSchemaReader reader,
			HttpClientBuilder httpClientBuilder)
			throws SchemaException, URISyntaxException {
		super(model, parent, imports, baseURI, reader, httpClientBuilder);
	}

}
