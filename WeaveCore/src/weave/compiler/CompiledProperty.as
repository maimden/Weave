/*
    Weave (Web-based Analysis and Visualization Environment)
    Copyright (C) 2008-2011 University of Massachusetts Lowell

    This file is a part of Weave.

    Weave is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License, Version 3,
    as published by the Free Software Foundation.

    Weave is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with Weave.  If not, see <http://www.gnu.org/licenses/>.
*/

package weave.compiler
{
	/**
	 * @author adufilie
	 */
	internal class CompiledProperty implements ICompiledObject
	{
		/**
		 * @param name The name of the property.
		 * @param value The compiled object used to compute the value.
		 */
		public function CompiledProperty(name:String, value:ICompiledObject)
		{
			this.name = name;
			this.value = value;
		}
		/**
		 * This is the name of the property.
		 */
		public var name:String;
		/**
		 * This is the compiled object for the value of the property
		 */
		public var value:ICompiledObject;
	}
}
