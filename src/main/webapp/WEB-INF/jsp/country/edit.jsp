<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>

<form action="#" method="get" id="form-country-edit"
	class="form-horizontal">

	<!-- Country ID To Look -->
	<input type="hidden" id="id" name="id" value="${countryModel.id}" />

	<!-- Code -->
	<div class="form-group">
		<label class="control-label col-md-3" for="code">Code</label>
		<div class="col-md-8">
			<input type="text" id="code" name="code" class="form-control"
				required="required" placeholder="Code" value="${countryModel.code}">
		</div>
	</div>

	<!-- Name -->
	<div class="form-group">
		<label class="control-label col-md-3" for="name">Name</label>
		<div class="col-md-8">
			<input type="text" id="name" name="name" class="form-control"
				required="required" placeholder="Name" value="${countryModel.name}">
		</div>
	</div>

	<!-- Citizen Qty -->
	<div class="form-group">
		<label class="control-label col-md-3" for="citizenQty">Citizen
			Qty</label>
		<div class="col-md-8">
			<input type="text" id="citizenQty" name="citizenQty"
				class="form-control" placeholder="Citizen Qty"
				value="${countryModel.citizenQty}">
		</div>
	</div>

	<!-- Continent -->
	<div class="form-group">
		<label class="control-label col-md-3" for="continent">Continent</label>
		<div class="col-md-8">
			<select id="continent" name="continent" class="form-control"
				required="required">
				<option value="" ${countryModel.continent == ""? 'selected' : ''}>-
					SELECT -</option>
				<option value="asia"
					${countryModel.continent == "asia"? 'selected' : ''}>Asia</option>
				<option value="african"
					${countryModel.continent == "african"? 'selected' : ''}>African</option>
				<option value="american"
					${countryModel.continent == "american"? 'selected' : ''}>American</option>
				<option value="europe"
					${countryModel.continent == "europe"? 'selected' : ''}>Europe</option>
			</select>
		</div>
	</div>

<div style="text-align:right; width:100%; padding:0;">
	<!-- Edit Buttons -->
	<button type="reset" class="btn btn-primary btn-sm">Close</button>
	<button type="submit" class="btn btn-primary btn-sm">Save</button>
</div>
	<br>
	<!-- Add Province Button -->
	<button type="button" id="button-province-tambah">Add
		Province</button>

	<!-- Submit Button -->
	<div class="modal-footer">
	<table class="table table-striped table-hover" id="table-province">
			<thead>
				<tr>
					<th>No.</th>
					<th>Code</th>
					<th>Name</th>
					<th>Action</th>
				</tr>
			</thead>
			<tbody id="list-data-province">

			</tbody>
		</table>
		
<script type="text/javascript">
		listDataProvince
		
		function listDataProvince() {
			$.ajax({
				url : "country/listProvince.html",
				type : "get",
				dataType : "html",
				success : function(result) {
					$("#list-data-province").html(result);
				}
			});
		}
		</script>
	</div>
</form>