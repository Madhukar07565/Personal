ACC.ezgautocomplete = {
	_autoload: [
	    "bindSearchAutocomplete"
	 ],
	 bindSearchAutocomplete:function(){
		 $.widget("custom.ezgautocomplete",$.ui.autocomplete,{
			 _create:function(){
					var option = this.element.data("options");
					this._setOptions({
						minLength: option.minCharactersBeforeRequest,
						displayProductImages: option.displayProductImages,
						delay: option.waitTimeBeforeRequest,
						autocompleteUrl: option.autocompleteUrl,
						source: this.source
					});
					$.ui.autocomplete.prototype._create.call(this);
				},
				options:{
					cache:{}, // init cache per instance
					focus: function (){return false;}, // prevent textfield value replacement on item focus
				},
				_renderItem : function (ul, item){
					var renderHtml = "<div style='text-align:left;padding-top:3px;'>" + item.value + "</div>";
					return $("<li>")
							.data("item.autocomplete", item)
							.append(renderHtml)
							.appendTo(ul);
				},
				_resizeMenu : function () {
					  var ul = this.menu.element;
					  ul.outerWidth(this.element.outerWidth());
					}
				,
				source: function (request, response)
				{
					var self=this;
					var term = request.term.toLowerCase();
					if (term in self.options.cache)
					{
						return response(self.options.cache[term]);
					}

					$.getJSON(self.options.autocompleteUrl, {term: request.term}, function (data)
					{
						var autoSearchData = [];
						if(data.suggestions != null){
							$.each(data.suggestions, function (i, obj)
							{
								autoSearchData.push({
									value: obj.term,
									type: "autoSuggestion"
								});
							});
						}
						if(data.products != null){
							$.each(data.products, function (i, obj)
							{
								autoSearchData.push({
									value: obj.name,
									code:  obj.code,
									type: "productResult",
								});
							});
						}
						self.options.cache[term] = autoSearchData;
						return response(autoSearchData);
					});
				}
			 
			 
		 }); 
		 $search = $(".js-site-search-input-ezg");
			if($search.length>0){
				$search.ezgautocomplete()
			}
	 }
}