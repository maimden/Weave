<<<<<<< HEAD
package weave.beans;


public class PGGeom {
	/**
	 * Bean class intended to store a row of PostGIS geometries. 
	 */

	public int gid;
	public int type;
	public double[] points;

	public PGGeom()
	{
	}
	
	// convenience constructor. variables are public. 
	public PGGeom(int numPoints, int type)
	{
		this.type = type;
		this.points = new double[numPoints*2];
	}
	
=======
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

package weave.beans;

/**
 * Bean class for storing coordinates from a PostGIS geometry. 
 */
public class PGGeom
{
	/**
	 * Stores PostGIS geometry type id.
	 */
	public int type;

	/**
	 * Stores X coordinates at even numbered indices and Y coords are at odd numbered indices.
	 */
	public double[] xyCoords;

	/**
	 * Default constructor, does not initialize anything.
	 */
	public PGGeom()
	{
	}
>>>>>>> refs/remotes/origin/master
}
