<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>

<form action="#" method="get" id="form-country-tambah"
	class="form-horizontal">

	<!-- Code -->
	<div class="form-group">
		<label class="control-label col-md-3" for="code">Code</label>
		<div class="col-md-8">
			<input type="text" id="code" name="code" class="form-control"
				required="required" placeholder="Code">
		</div>
	</div>

	<!-- Name -->
	<div class="form-group">
		<label class="control-label col-md-3" for="name">Name</label>
		<div class="col-md-8">
			<input type="text" id="name" name="name"
				class="form-control" required="required"
				placeholder="Name">
		</div>
	</div>

	<!-- Citizen Qty -->
	<div class="form-group">
		<label class="control-label col-md-3" for="citizenQty">Citizen Qty</label>
		<div class="col-md-8">
			<input type="text" id="citizenQty" name="citizenQty"
				class="form-control" placeholder="Citizen Qty">
		</div>
	</div>

	<!-- Continent -->
	<div class="form-group">
		<label class="control-label col-md-3" for="continent">Continent</label>
		<div class="col-md-8">
			<select id="continent" name="continent" class="form-control">
					<option value="" >- SELECT -</option>
					<option value="asia" >Asia</option>
					<option value="african" >African</option>
					<option value="american" >American</option>
					<option value="europe" >Europe</option>
			</select>
		</div>
	</div>

	<!-- Submit Button -->
	<div class="modal-footer">
		<button type="reset" class="btn btn-primary btn-sm">Close</button>
		<button type="submit" class="btn btn-primary btn-sm">Save</button>
	</div>
</form>