/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.fineract.portfolio.search.data;

import java.util.Locale;
import org.apache.fineract.portfolio.search.SearchConstants.SearchSupportedResources;

public class SearchConditions {

    private final String searchQuery;
    private final String searchResource;
    private final Boolean clientSearch;
    private final Boolean groupSearch;
    private final Boolean loanSeach;
    private final Boolean savingSeach;
    private final Boolean shareSeach;
    private final Boolean clientIdentifierSearch;
    private Boolean exactMatch;

    public SearchConditions(final String searchQueryParam, final String searchResource, Boolean exactMatch) {
        this.searchQuery = searchQueryParam;
        this.searchResource = searchResource;
        this.exactMatch = exactMatch;
        this.clientSearch = null == searchResource
                || searchResource.toLowerCase(Locale.ENGLISH).contains(SearchSupportedResources.CLIENTS.name().toLowerCase(Locale.ENGLISH));
        this.groupSearch = null == searchResource
                || searchResource.toLowerCase(Locale.ENGLISH).contains(SearchSupportedResources.GROUPS.name().toLowerCase(Locale.ENGLISH));
        this.loanSeach = null == searchResource
                || searchResource.toLowerCase(Locale.ENGLISH).contains(SearchSupportedResources.LOANS.name().toLowerCase(Locale.ENGLISH));
        this.savingSeach = null == searchResource
                || searchResource.toLowerCase(Locale.ENGLISH).contains(SearchSupportedResources.SAVINGS.name().toLowerCase(Locale.ENGLISH));
        this.shareSeach = null == searchResource
                || searchResource.toLowerCase(Locale.ENGLISH).contains(SearchSupportedResources.SHARES.name().toLowerCase(Locale.ENGLISH));
        this.clientIdentifierSearch = null == searchResource || searchResource.toLowerCase(Locale.ENGLISH)
                .contains(SearchSupportedResources.CLIENTIDENTIFIERS.name().toLowerCase(Locale.ENGLISH));
    }

    public SearchConditions(final String searchQueryParam, final String searchResource, final Boolean clientSearch,
            final Boolean groupSearch, final Boolean loanSeach, final Boolean savingSeach, final Boolean shareSeach,
            final Boolean clientIdentifierSearch, Boolean exactMatch) {
        this.searchQuery = searchQueryParam;
        this.searchResource = searchResource;
        this.clientSearch = clientSearch;
        this.groupSearch = groupSearch;
        this.loanSeach = loanSeach;
        this.savingSeach = savingSeach;
        this.shareSeach = shareSeach;
        this.clientIdentifierSearch = clientIdentifierSearch;
        this.exactMatch = exactMatch;
    }

    public String getSearchQuery() {
        return this.searchQuery;
    }

    public String getSearchResource() {
        return this.searchResource;
    }

    public Boolean getExactMatch() {
        return this.exactMatch;
    }

    public Boolean isClientSearch() {
        return this.clientSearch;
    }

    public Boolean isGroupSearch() {
        return this.groupSearch;
    }

    public Boolean isLoanSeach() {
        return this.loanSeach;
    }

    public Boolean isSavingSeach() {
        return this.savingSeach;
    }

    public Boolean isShareSeach() {
        return this.shareSeach;
    }

    public Boolean isClientIdentifierSearch() {
        return this.clientIdentifierSearch;
    }

}
