/**
 * 	Copyrights reserved to authors of this code (available from GitHub
 * 	repository https://github.com/Letme/give-me-coinsMonitoringApp
 * 
 *  This file is part of Give-me-coins.com Dashboard Android App
 * 
 *	Give-me-coins.com Dashboard is free software: you can redistribute it 
 *	and/or modify it under the terms of the GNU General Public License as 
 *  published by the Free Software Foundation, either version 3 of the 
 *  License, or (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/


package give_me_coins.dashboard;

import android.content.ComponentName;
import android.content.Context;
import android.content.SharedPreferences;



public class Widget_mainLargeLTC extends Widget_mainLarge{

		protected String getApiKey(Context context)
		{
			
			SharedPreferences sp = context.getSharedPreferences(context.getString(R.string.preference_file_key), Context.MODE_PRIVATE);
			return sp.getString(context.getString(R.string.saved_api_key),null);
			
		}

		@Override
		protected ComponentName getComponentName(Context context) {
			// TODO Auto-generated method stub
			return new ComponentName(context, Widget_mainLargeLTC.class);
		}

}